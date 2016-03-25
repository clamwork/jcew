package cn.com.jandar.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.jandar.model.Devicefault;
import cn.com.jandar.model.Devicergxj;
import cn.com.jandar.model.Driveway;
import cn.com.jandar.model.Manufacturer;
import cn.com.jandar.model.Point;
import cn.com.jandar.model.Vehicle;
import cn.com.jandar.service.IAppcodeService;
import cn.com.jandar.service.IDeviceService;
import cn.com.jandar.service.IDevicefaultService;
import cn.com.jandar.service.IDevicergxjService;
import cn.com.jandar.service.IDrivewayService;
import cn.com.jandar.service.IManufacturerService;
import cn.com.jandar.service.IPointService;
import cn.com.jandar.service.IVehicleService;

@Controller
@RequestMapping("/task")
public class TaskController {
	
	private static Logger logger = LoggerFactory.getLogger(TaskController.class);
	
	private static DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@Resource
	private IManufacturerService manufacturerService;
	
	@Resource
	private IPointService pointService;
	
	@Resource
	private IDeviceService deviceService;
	
	@Resource
	private IDrivewayService drivewayService;
	
	@Resource
	private IVehicleService vehicleService;
	
	@Resource
	private IDevicergxjService devicergxjService;
	
	@Resource
	private IDevicefaultService devicefaultService;
	
	@Resource
	private IAppcodeService appcodeService;
	
	@ResponseBody
	@RequestMapping(value="/manufacturer/{code}", method = RequestMethod.GET)
	public Map<String,Object> getManufactureInfo(@PathVariable String code){
		Map<String,Object> map = new HashMap<String,Object>();
		Manufacturer manufacturer = manufacturerService.getManufacturer(code);
		map.put("manufacturer", manufacturer);
		logger.info("loading....");
		return map;
	}
	
	Map<String,String> deviceFaultType;
	
	/**
	 * 人工巡检
	 * @param manufacture
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/polling", method = RequestMethod.GET)
	public Map<String,Object> polling(){
		Map<String,Object> map = new HashMap<String,Object>();
		List<Object> objs = new ArrayList<Object>();
		Date date = new Date();
		logger.info("########### 定时执行任务(设备人工巡检)开始 ############");
		Long t1 = System.currentTimeMillis();
		List<Point> listPoint = pointService.getAllUsingPoints();
		for(Point point :listPoint){
			logger.info("正在巡检点位" + point.getName());
			List<Driveway> listDriveway =point.getDriveways();
			for(Driveway driveway:listDriveway){
				objs.add( headle(driveway, date));
			}
		}
		map.put("data",objs);
		Long t2 = System.currentTimeMillis();

		logger.info("########### 定时执行任务(设备人工巡检)结束,用时" + (t2 - t1)
				+ "ms ############");
		return map;
	}
	
	/**
	 * 超时无数据
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/nodata", method = RequestMethod.GET)
	public  Map<String,Object> nodata(@PathVariable Long pointid){
		Map<String,Object> map = new HashMap<String,Object>();
		return map;
	}
	/**
	 * 设备签到
	 * @param deviceid
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/signin", method = RequestMethod.GET)
	public  Map<String,Object> singin(@PathVariable Long deviceid){
		Map<String,Object> map = new HashMap<String,Object>();
		return map;
	}
	/**
	 * 车道巡检 单一车道（车道编码）
	 * @param drivewayCode
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/driveway/polling/{drivewayCode}", method = RequestMethod.GET)
	public  Map<String,Object> singin(@PathVariable String drivewayCode){
		Map<String,Object> map = new HashMap<String,Object>();
		Driveway driveway = drivewayService.getDriveway(drivewayCode);
		if(driveway != null){
			map.put(driveway.getCode(), headle(driveway, new Date()));
		}else{
			map.put("dataError", "未找到该车道，请正确书写车道编码");
		}
		return map;
	}
	
	public Map<String,Object> headle(Driveway driveway,Date date){
		Map<String,Object> map = new HashMap<String,Object>();
		Vehicle vehicle = null;
		try {
			Date lastTime = getTime(df.format(date),driveway);
			vehicle =  vehicleService.getLastVehicle(lastTime, driveway);
			Devicergxj devicergxj = devicergxjService
					.getDevicergxjByDrivewayId(driveway.getId());
			Devicergxj d ;
			if (devicergxj != null) {
				d = handle(vehicle, devicergxj, driveway, date);
			} else {
				d = handle(vehicle, new Devicergxj(), driveway, date);
			}
			map.put("drivewayCode", d.getDriveway().getCode());
			map.put("Faultexplain",d.getFaultexplain());
			map.put("FaultHours", d.getFaultHours());
			map.put("faulttype",d.getFaulttype());
			map.put("state",d.getIsfault());
			map.put("occurdate",d.getOccurdate());
			map.put("gcsj", d.getGcsj_date());
			map.put("pointName", d.getPointname());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return map;
	}
	
	public Map<String,String> getDeviceFaultType(){
		if(this.deviceFaultType == null){
			deviceFaultType = appcodeService.getAppcodeByType(
					"deviceFaultType");
		}
		return deviceFaultType;
	}
	
	public Devicergxj handle(Vehicle vehicle, Devicergxj devicergxj,
			Driveway driveway, Date cqsj) {
		List<Devicefault> list = devicefaultService
				.getFaultsByDrivewayTypeCause(driveway, null, null);
		if (list.size() > 0) {

			Devicefault devicefault = list.get(0);

			if ("1".equals(devicefault.getStatus())) {
				devicergxj.setHasreport("y");
			} else {
				devicergxj.setHasreport("n");
			}

			devicergxj.setFaulttype(getDeviceFaultType().get(devicefault.getType()));
			devicergxj.setFaultexplain(devicefault.getFaultexplain());
			devicergxj.setOccurdate(devicefault.getOccurdate());
			devicergxj.setIsfault(devicefault.getStatus());

		} else {
			devicergxj.setHasreport("n");
			devicergxj.setFaulttype(null);
			devicergxj.setFaultexplain(null);
			devicergxj.setOccurdate(null);
			devicergxj.setIsfault(null);
		}

		// 处理莫名其妙的BUG
		if (list.size() > 1) {
			for (int i = 1; i < list.size(); i++) {
				devicefaultService.deleteDevicefault(list.get(i).getId());
			}
		}

		devicergxj.setPoint(driveway.getPoint());
		devicergxj.setCqsj_date(cqsj);
		devicergxj.setCzr("后台任务");

		if (vehicle == null || vehicle.getPassdatetime() == null) {
			Date lastDate = vehicleService.getLastPassDateByDriveway(driveway);
			devicergxj.setGcsj_date(lastDate);
			if (lastDate != null) {
				Date date = new Date();
				int hours = (int) ((date.getTime() - lastDate.getTime()) / (1000 * 60 * 60));
				devicergxj.setFaultHours(hours);
			}
		} else {
			devicergxj.setGcsj_date(vehicle.getPassdatetime());
		}

		if (vehicle != null) {
			devicergxj.setGctp(vehicle.getPic1());
			devicergxj.setVehicleid(vehicle.getId());
		} else {
			devicergxj.setGctp(null);
			devicergxj.setVehicleid(new Long(0));
		}

		devicergxj.setDriveway(driveway);
		devicergxj.setPointcode(driveway.getPoint().getCode());
		devicergxj.setPointname(driveway.getPoint().getName());
		devicergxj.setControlcode(driveway.getDevice().getControl().getCode());
		devicergxj.setControldirection(driveway.getDevice().getControl()
				.getDirection());

		devicergxjService.saveDevicergxj(devicergxj);
		return devicergxj;
	}
	
	
	/**
	 * 根据时间点patroldate，车道driveway确定查询时间范围
	 * 
	 * @param date
	 * @param driveway
	 * @return
	 * @throws ParseException
	 */
	public Date getTime(String date, Driveway driveway)
			throws ParseException {
		Date dt = df.parse(date);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		int nocartime;
		if (timeJudge(date, driveway)) {
			nocartime = driveway.getDaynocartime() == null ? 2 : driveway
					.getDaynocartime();
			calendar.setTime(dt);
			calendar.add(calendar.HOUR_OF_DAY, -nocartime);
		} else {
			nocartime = driveway.getNightnocartime() == null ? 4 : driveway
					.getNightnocartime();
			
			calendar.add(calendar.HOUR_OF_DAY, -nocartime);
		}
		return calendar.getTime();
	}
	
	/**
	 * 判断时间点归属：白天/夜晚
	 * 
	 * @param date
	 * @param driveway
	 * @return
	 * @throws ParseException
	 */
	public boolean timeJudge(String date, Driveway driveway)
			throws ParseException {
		String daytime;
		Point point = driveway.getPoint();
		if (null == point) {
			System.out.println(">>>" + driveway.getCode());
			daytime = "06:00-18:00";
		} else {
			daytime = (driveway.getPoint().getDaytime() == null) ? ("06:00-18:00")
					: (driveway.getPoint().getDaytime());
		}
		int t1 = Integer.parseInt(daytime.substring(0, 2) + "0000");
		int t2 = Integer.parseInt(daytime.substring(6, 8) + "0000");
		int d = Integer.parseInt(date.split(" ")[1].replaceAll(":", ""));
		if (t1 <= t2) {
			if (d >= t1 && d < t2) {
				return true;
			} else {
				return false;
			}
		} else {
			if ((d >= t1 && d < t2 + 240000) || (d < t2)) {
				return true;
			} else {
				return false;
			}
		}
	}

}
