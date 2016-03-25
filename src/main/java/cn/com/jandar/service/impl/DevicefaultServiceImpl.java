package cn.com.jandar.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.dao.IDevicefaultDao;
import cn.com.jandar.model.Devicefault;
import cn.com.jandar.model.Driveway;
import cn.com.jandar.service.IDevicefaultService;

@Transactional
@Service("devicefaultService")
public class DevicefaultServiceImpl implements IDevicefaultService {

	@Resource
	private IDevicefaultDao devicefaultDao;

	@Override
	public List<Devicefault> getFaultsByDrivewayTypeCause(Driveway driveway, String type, String cause) {
		return devicefaultDao.getFaultsByDrivewayTypeCause(driveway,type,cause) ;
	}

	@Override
	public void deleteDevicefault(Long id) {
		devicefaultDao.deleteDevicefault(id);
		
	}
	
}
