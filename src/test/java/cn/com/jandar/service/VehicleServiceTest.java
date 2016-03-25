package cn.com.jandar.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.jandar.model.Vehicle;

@ContextConfiguration(locations= {"classpath:spring.xml","classpath:spring-hibernate.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class VehicleServiceTest {
	
	@Resource
	private IVehicleService vehicleService;
	
	@Test
	public void getVehicle(){
		String vehicleCode = "1212312413212313";
		Vehicle v = vehicleService.getVehicle(vehicleCode);
		System.out.println(vehicleCode =" ----->" +v);
	}

}
