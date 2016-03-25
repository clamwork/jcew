package cn.com.jandar.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cn.com.jandar.dao.IDepartmentDao;
import cn.com.jandar.model.Department;

@SuppressWarnings("unchecked")
@Repository("deoartmentDao")
public class DepartmentDaoImpl implements IDepartmentDao {

	@Resource
	protected SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Department getDepartmentByCode(String code) {
		return (Department) this.getSession().createCriteria(Department.class).add(Restrictions.eq("code", code))
				.setMaxResults(1).uniqueResult();
	}
	
	public List<Department> getAllDePartments(){
		return this.getSession().createCriteria(Department.class).list();
	}

}
