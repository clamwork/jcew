package cn.com.jandar.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cn.com.jandar.dao.IVehicleDao;
import cn.com.jandar.model.Driveway;
import cn.com.jandar.model.Vehicle;

@Repository("vehicleDao")
public class VehicleDaoImpl implements IVehicleDao {
	
	@Resource
	protected SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	/**
	 * 
	 * @param dw
	 * @param lastdate
	 * @return
	 */
	public Boolean isExitData(Driveway driveway,Date startdate){
		List<Driveway> listdw = new ArrayList<Driveway>();
		listdw.add(driveway);
		Session session = this.getSession();
		Criteria criteria= session.createCriteria(Vehicle.class);
		criteria.add(Restrictions.le("passdatetime", startdate));
		criteria.add(Restrictions.in("driveways", listdw));
		criteria.setMaxResults(1);
		if(criteria.uniqueResult()!=null){
			return true;
		}
		return false;
	}
	
	public Long save(Vehicle vehicle){
		return (Long) this.getSession().save(vehicle);
	}
	
	public void merge(Vehicle vehicle){
		this.getSession().merge(vehicle);
	}
	
	public Vehicle findInfo(Long id){
		return (Vehicle) this.getSession().createCriteria(Vehicle.class).add(Restrictions.eq("id", id)).uniqueResult();
	}

	@Override
	public List<Vehicle> findVehicleList(int maxnum) {
		return this.getSession().createCriteria(Vehicle.class).setMaxResults(maxnum).list();
	}

	@Override
	public Vehicle getLastVehicle(Date lastTime,Driveway driveway) {
		Session session = this.getSession();
		Criteria criteria= session.createCriteria(Vehicle.class);
		criteria.add(Restrictions.le("passdatetime", lastTime));
		criteria.add(Restrictions.eq("driveway", driveway));
		criteria.setMaxResults(1);
		return (Vehicle) criteria.uniqueResult();
	}
	
	public Vehicle getLastVehicle(String vehicleCode){
		Session session = this.getSession();
		Criteria criteria= session.createCriteria(Vehicle.class);
		criteria.add(Restrictions.eq("vehiclecode", vehicleCode));
		criteria.setMaxResults(1);
		return (Vehicle) criteria.uniqueResult();

	}

	@Override
	public Date getLastPassDateByDriveway(Driveway driveway) {
		return null;
	}
}
