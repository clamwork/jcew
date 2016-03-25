package cn.com.jandar.dao;

import java.io.Serializable;

import cn.com.jandar.model.Devicergxj;

public interface IDevicergxjDao {

	public Devicergxj getDevicergxjByDrivewayId(Serializable drivewayId);

	public void saveDevicergxj(Devicergxj devicergxj);

}
