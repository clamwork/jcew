package cn.com.jandar.dao;

import cn.com.jandar.model.Device;

public interface IDeviceDao {
	
	public Boolean signinCount(Device device);
	
	public Long add(Device device);
	
	public Device merge(Device device);

}
