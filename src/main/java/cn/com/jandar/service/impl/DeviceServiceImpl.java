package cn.com.jandar.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.dao.IDeviceDao;
import cn.com.jandar.model.Device;
import cn.com.jandar.service.IDeviceService;

@Transactional
@Service("deviceService")
public class DeviceServiceImpl implements IDeviceService {

	@Resource
	private IDeviceDao deviceDao;

	@Override
	public Boolean signin(Long deviceid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean signin(String deviceCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Device> getAllDevice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Device> getDeviceByPoint(Long pointid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Device> getDeviceByControl(Long pointid, Long controlid) {
		// TODO Auto-generated method stub
		return null;
	}
}
