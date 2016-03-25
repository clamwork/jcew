package cn.com.jandar.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.dao.IVehicleDao;
import cn.com.jandar.model.Driveway;
import cn.com.jandar.model.Vehicle;
import cn.com.jandar.service.IVehicleService;

@Transactional
@Service("vehicleService")
public class VehicleServiceImpl implements IVehicleService {

	@Resource
	private IVehicleDao vehicleDao;

	@Override
	public Vehicle getLastVehicle(Date lastTime,Driveway driveway) {
		return vehicleDao.getLastVehicle(lastTime,driveway);
	}

	@Override
	public Vehicle getVehicle(String vehicleCode) {
		return vehicleDao.getLastVehicle(vehicleCode);
	}

	@Override
	public Date getLastPassDateByDriveway(Driveway driveway) {
		return vehicleDao.getLastPassDateByDriveway(driveway);
	}
}
