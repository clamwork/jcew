package cn.com.jandar.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cn.com.jandar.dao.IDevicefaultDao;
import cn.com.jandar.model.Devicefault;
import cn.com.jandar.model.Driveway;

@SuppressWarnings("unchecked")
@Repository("devicefaultDao")
public class DevicefaultDaoimpl implements IDevicefaultDao {

	@Resource
	protected SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Long save(Devicefault devicefacture){
		return (Long) this.getSession().save(devicefacture);
	}
	

	@Override
	public List<Devicefault> getFaultsByDrivewayTypeCause(Driveway driveway, String type, String cause) {
		Criteria criteria = this.getSession().createCriteria(
				Devicefault.class);
		if (cause != null) {
			criteria.add(Restrictions.eq("cause", cause));
		}
		if (type != null) {
			criteria.add(Restrictions.eq("type", type));
		}
		criteria.add(Restrictions.eq("driveway", driveway));
		criteria.add(Restrictions.or(Restrictions.eq("status", "0"),
				Restrictions.eq("status", "1")));

		return criteria.list();
	}

	@Override
	public void deleteDevicefault(Long id) {
		this.getSession().createQuery("delete from DeviceFault where id = :id").setParameter("id", id).executeUpdate();
	}
}
