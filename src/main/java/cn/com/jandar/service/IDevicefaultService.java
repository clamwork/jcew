package cn.com.jandar.service;

import java.util.List;

import cn.com.jandar.model.Devicefault;
import cn.com.jandar.model.Driveway;

public interface IDevicefaultService {

	public List<Devicefault> getFaultsByDrivewayTypeCause(Driveway driveway,
			String type, String cause);

	public void deleteDevicefault(Long id);

}
