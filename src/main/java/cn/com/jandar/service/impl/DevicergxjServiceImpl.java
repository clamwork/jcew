package cn.com.jandar.service.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.dao.IDevicergxjDao;
import cn.com.jandar.model.Devicergxj;
import cn.com.jandar.service.IDevicergxjService;

@Transactional
@Service("devicergxjService")
public class DevicergxjServiceImpl implements IDevicergxjService {

	@Resource
	IDevicergxjDao devicergxjDao;

	@Override
	@Transactional(readOnly = true)
	public Devicergxj getDevicergxjByDrivewayId(Serializable id) {
		
		return devicergxjDao.getDevicergxjByDrivewayId(id);
	}

	@Override
	public void saveDevicergxj(Devicergxj devicergxj) {
		devicergxjDao.saveDevicergxj(devicergxj);
		
	}
}
