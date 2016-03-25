package cn.com.jandar.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.dao.IPointDao;
import cn.com.jandar.model.Department;
import cn.com.jandar.model.Manufacturer;
import cn.com.jandar.model.Point;
import cn.com.jandar.service.IPointService;

@Transactional
@Service("pointService")
public class PointServiceimpl implements IPointService {

	@Resource
	private IPointDao pointDao;

	@Override
	public List<Point> getByManufacture(Manufacturer manufacture) {
		return pointDao.getByManufacture(manufacture);
	}

	@Override
	public List<Point> getByDepartment(Department department) {
		return pointDao.getByDepartment(department);
	}

	@Override
	public List<Point> getAllPoints() {
		return pointDao.getAllPoints();
	}

	@Override
	public List<Point> getAllUsingPoints() {
		return pointDao.getAllUsingPoints();
	}
	
	
}
