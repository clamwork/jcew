package cn.com.jandar.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cn.com.jandar.dao.IManufacturerDao;
import cn.com.jandar.model.Manufacturer;

@Repository("manufacturerDao")
public class ManufacturerDaoImpl implements IManufacturerDao {

	@Resource
	protected SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Manufacturer> getAllManufacturers() {
		Criteria criteria = this.getSession().createCriteria(Manufacturer.class);
		List<Manufacturer> manufactures = criteria.list();
		return manufactures;
	}

	@Override
	public Manufacturer getManufacturer(String code) {
		Criteria criteria = this.getSession().createCriteria(Manufacturer.class);
		criteria.add(Restrictions.eq("namecode", code));
		criteria.setMaxResults(1);
		return  (Manufacturer) criteria.uniqueResult();
	}

}