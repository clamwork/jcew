package cn.com.jandar.dao;

import java.util.List;

import cn.com.jandar.model.Devicefault;
import cn.com.jandar.model.Driveway;

public interface IDevicefaultDao {

	List<Devicefault> getFaultsByDrivewayTypeCause(Driveway driveway, String type, String cause);

	void deleteDevicefault(Long id);

}
