package cn.com.jandar.service;

import java.util.List;

import cn.com.jandar.model.Manufacturer;

public interface IManufacturerService {
	
	public List<Manufacturer> getAllManufacturers();
	
	public Manufacturer getManufacturer(String code);

}
