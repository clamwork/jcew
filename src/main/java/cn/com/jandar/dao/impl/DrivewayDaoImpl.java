package cn.com.jandar.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.dao.IDrivewayDao;
import cn.com.jandar.model.Device;
import cn.com.jandar.model.Driveway;
import cn.com.jandar.model.Point;

@Repository("drivewayDao")
public class DrivewayDaoImpl implements IDrivewayDao {

	@Resource
	protected SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<Driveway> getByDevice(Device device){
		Criteria criteria = this.getSession().createCriteria(Driveway.class);
		criteria.add(Restrictions.eq("device", device));
		List<Driveway> driveways = criteria.list();
		return driveways;
	}
	
	public List<Driveway> getByPoint(Point point){
		Criteria criteria = this.getSession().createCriteria(Driveway.class);
		criteria.add(Restrictions.eq("point", point));
		List<Driveway> driveways = criteria.list();
		return driveways;
	}
	
	public Driveway getDriveway(String drivewatcode){
		Criteria criteria = this.getSession().createCriteria(Driveway.class);
		criteria.add(Restrictions.eq("code", drivewatcode));
		criteria.setMaxResults(1);
		return (Driveway) criteria.uniqueResult();
	}
	
}
