package cn.com.jandar.dao;

import java.util.Date;
import java.util.List;

import cn.com.jandar.model.Driveway;
import cn.com.jandar.model.Vehicle;

public interface IVehicleDao {
	
	public Boolean isExitData(Driveway dw,Date startdate);
	
	public Long save(Vehicle vehicle);
	
	public void merge(Vehicle vehicle);
	
	public Vehicle findInfo(Long id);
	
	public List<Vehicle> findVehicleList(int maxnum);

	public Vehicle getLastVehicle(Date lastTime, Driveway driveway);

	public Vehicle getLastVehicle(String vehicleCode);

	public Date getLastPassDateByDriveway(Driveway driveway);

}
