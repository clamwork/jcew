package cn.com.jandar.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cn.com.jandar.dao.IDevicergxjDao;
import cn.com.jandar.model.Devicergxj;

@Repository("devicergxjDao")
public class DevicergxjDaoImpl implements IDevicergxjDao {
	@Resource
	protected SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Devicergxj getDevicergxjByDrivewayId(Serializable drivewayId) {
		return (Devicergxj) this.getSession().createCriteria(Devicergxj.class)
				.add(Restrictions.eq("driveway.id", drivewayId)).setMaxResults(1).uniqueResult();
	}

	@Override
	public void saveDevicergxj(Devicergxj devicergxj) {
		if (devicergxj.getId() != null) {
			this.getSession().merge(devicergxj);
		} else {
			this.getSession().save(devicergxj);
		}
	}
}
