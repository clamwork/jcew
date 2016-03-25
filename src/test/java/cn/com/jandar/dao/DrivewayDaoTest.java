package cn.com.jandar.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.model.Driveway;

@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-hibernate.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
// defaultRollback=true不会改变数据库，false会改变数据库
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class DrivewayDaoTest {

	@Resource
	private IDrivewayDao drivewayDao;
	
	@Test
	public void getDriveway(){
		
		String drivewatcode = "323123124123123";
		Driveway driveway = drivewayDao.getDriveway(drivewatcode );
		System.out.println(drivewatcode+" ---- >" +driveway);
	}
}
