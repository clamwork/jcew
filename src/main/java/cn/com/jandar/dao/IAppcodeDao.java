package cn.com.jandar.dao;

import java.io.Serializable;
import java.util.Map;

import cn.com.jandar.model.Appcode;

public interface IAppcodeDao {
	
	public Appcode getAppcode(Serializable id);
	
	public void saveAppcode(Appcode entity);
	
	public void deleteAppcode(Serializable id) ;
	
	public Map<String, String> getAppcodeByType(String codetype);
}
