package cn.com.jandar.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cn.com.jandar.dao.IDeviceDao;
import cn.com.jandar.model.Device;

@Repository("deviceDao")
public class DeviceDaoImpl implements IDeviceDao {

	@Resource
	protected SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public Boolean signinCount(Device device){
		try{
			device.setSigninCount(device.getSigninCount()+1);
			getSession().merge(device);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public Long add(Device device)  {
		return (Long) this.getSession().save(device);
	}
	
	@Override
	public Device merge(Device device){
		return (Device) this.getSession().merge(device);
	}
}
