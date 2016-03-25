package cn.com.jandar.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.dao.IDrivewayDao;
import cn.com.jandar.model.Driveway;
import cn.com.jandar.service.IDrivewayService;

@Transactional
@Service("drivewayService")
public class DrivewayServiceImpl implements IDrivewayService {

	@Resource
	IDrivewayDao drivewayDao;
	
	@Override
	public Driveway getDriveway(String drivewatcode) {
		return drivewayDao.getDriveway(drivewatcode);
	}

}
