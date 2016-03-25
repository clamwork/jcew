package cn.com.jandar.dao;

import java.util.List;

import cn.com.jandar.model.Manufacturer;

public interface IManufacturerDao {
	
	public List<Manufacturer> getAllManufacturers();//获得所有的工程商

	public Manufacturer getManufacturer(String code);// 获得工程商

}
