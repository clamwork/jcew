package cn.com.jandar.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.jandar.model.Driveway;

@ContextConfiguration(locations= {"classpath:spring.xml","classpath:spring-hibernate.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class DrivewayServiceTest {
	
	@Resource
	private IDrivewayService drivewayService;
	
	@Test
	public void getDriveway(){
		String drivewatcode = "331022010004010377";
		Driveway driveway = drivewayService.getDriveway(drivewatcode );
		System.out.println(drivewatcode+" ---- >" +driveway);
	}
}
