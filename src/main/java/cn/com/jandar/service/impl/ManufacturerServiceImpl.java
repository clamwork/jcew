package cn.com.jandar.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.dao.IManufacturerDao;
import cn.com.jandar.model.Manufacturer;
import cn.com.jandar.service.IManufacturerService;

@Transactional
@Service("manufaturerService")
public class ManufacturerServiceImpl implements IManufacturerService {
	
	@Resource
	private IManufacturerDao manufacturerDao;

	@Override
	public List<Manufacturer> getAllManufacturers() {
		return manufacturerDao.getAllManufacturers();
	}

	@Override
	public Manufacturer getManufacturer(String code) {
		return manufacturerDao.getManufacturer(code) ;
	}

}
