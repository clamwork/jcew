package cn.com.jandar.service;

import java.util.List;

import cn.com.jandar.model.Device;

public interface IDeviceService {

	public Boolean signin(Long deviceid);//设备签到 -id
	
	public Boolean signin(String deviceCode);//设备签到 -code
	
	public List<Device> getAllDevice();//所有设备
	
	public List<Device> getDeviceByPoint(Long pointid);//根据点位获得设备
	
	public List<Device> getDeviceByControl(Long pointid,Long controlid);//获得某个方向下的设备
	
}
