package cn.com.jandar.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.model.Vehicle;

@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-hibernate.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
// defaultRollback=true不会改变数据库，false会改变数据库
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class VehicleDaoTest {
	@Resource
	private IVehicleDao vehicleDao;

	@Test
	public void findInfo() {
			Long id = 1391220826L;
			Vehicle vehicle = vehicleDao.findInfo(id);
			System.out.println("id:" + vehicle.getId());
	}

//	@Test
	public void findVehicleList() {
			List<Vehicle> vehicles = vehicleDao.findVehicleList(20);
			System.out.println("size:" + vehicles.size());
	}
}
