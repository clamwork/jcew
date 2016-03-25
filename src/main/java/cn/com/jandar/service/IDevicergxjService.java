package cn.com.jandar.service;

import java.io.Serializable;

import cn.com.jandar.model.Devicergxj;

public interface IDevicergxjService {

	Devicergxj getDevicergxjByDrivewayId(Serializable id);

	void saveDevicergxj(Devicergxj devicergxj);

}
