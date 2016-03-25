package cn.com.jandar.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.dao.IControlDao;
import cn.com.jandar.service.IControlService;

@Transactional
@Service("controlService")
public class ControlServiceImpl implements IControlService {
	
	@Resource
	private IControlDao controlDao;

}
