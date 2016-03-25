package cn.com.jandar.dao.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.dao.IAppcodeDao;
import cn.com.jandar.model.Appcode;

@SuppressWarnings("unchecked")
@Repository("appcodeDao")
public class AppcodeDaoImpl implements IAppcodeDao {
	
	@Resource
	protected SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional(readOnly = true)
	public Appcode getAppcode(Serializable id) {
		return (Appcode) this.getSession().get(Appcode.class, id);
	}

	
	@Override
	@Transactional(readOnly = true)
	public Map<String, String> getAppcodeByType(String codetype) {
			Criteria criteria = getSession().createCriteria(
					Appcode.class);
			criteria.add(Restrictions.eq("codetype", codetype));
			List<Appcode> list = criteria.list();
			Map<String, String> map = new HashMap<String, String>();
			for (Appcode ac : list) {
				map.put(ac.getCode(), ac.getCodename());
			}
			return map;
		}

	@Override
	public void saveAppcode(Appcode entity) {
		this.getSession().save(entity);
	}

	@Override
	public void deleteAppcode(Serializable id) {
		this.getSession().createSQLQuery("delete from APP_CODETBL where id = :id").setParameter("id", id).executeUpdate();
	}
	
	

}
