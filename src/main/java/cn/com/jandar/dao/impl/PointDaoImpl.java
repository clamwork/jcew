package cn.com.jandar.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cn.com.jandar.dao.IPointDao;
import cn.com.jandar.model.Department;
import cn.com.jandar.model.Manufacturer;
import cn.com.jandar.model.Point;


@Repository("pointDao")
public class PointDaoImpl implements IPointDao {

	@Resource
	protected SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Point> getByManufacture(Manufacturer manufacture) {
		Criteria criteria = this.getSession().createCriteria(Point.class);
		criteria.add(Restrictions.eq("manufacture", manufacture));
		List<Point> points = criteria.list();
		return points;
	}
	
	@Override
	public List<Point> getByDepartment(Department department){
		Criteria criteria = this.getSession().createCriteria(Point.class);
		criteria.add(Restrictions.eq("department", department));
		List<Point> points = criteria.list();
		return points;
	}
	

	@Override
	public List<Point> getAllPoints() {
		Criteria criteria = this.getSession().createCriteria(Point.class);
		List<Point> points = criteria.list();
		return points;
	}
	
	@Override
	public List<Point> getAllUsingPoints() {
		Criteria criteria = this.getSession().createCriteria(Point.class);
		criteria.add(Restrictions.or(Restrictions.eq("state", "1"),
				Restrictions.eq("state", "3")));
		List<Point> points = criteria.list();
		return points;
	}
	
	
}
