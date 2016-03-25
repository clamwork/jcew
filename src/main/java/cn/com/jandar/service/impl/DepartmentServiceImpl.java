package cn.com.jandar.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.dao.IDepartmentDao;
import cn.com.jandar.service.IDepartmentService;

@Transactional
@Service("departmentService")
public class DepartmentServiceImpl implements IDepartmentService {

	@Resource
	private IDepartmentDao departmentDao;
	
}
