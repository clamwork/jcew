package cn.com.jandar.dao;

import java.util.List;

import cn.com.jandar.model.Device;
import cn.com.jandar.model.Driveway;
import cn.com.jandar.model.Point;

public interface IDrivewayDao {

	public List<Driveway> getByDevice(Device device);//根据设备 获取车道
	
	public List<Driveway> getByPoint(Point point);//根据点位 获取车道
	
	public Driveway getDriveway(String drivewatcode);//根据编码 获取车道 编码唯一
	
}
