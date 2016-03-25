package cn.com.jandar.service;

import java.util.Date;

import cn.com.jandar.model.Driveway;
import cn.com.jandar.model.Vehicle;

public interface IVehicleService {
	
	public Vehicle getLastVehicle(Date lastTime,Driveway driveway);
	
	public Vehicle getVehicle(String vehicleCode);

	public Date getLastPassDateByDriveway(Driveway driveway);
	
}
