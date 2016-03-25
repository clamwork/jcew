package cn.com.jandar.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.jandar.dao.IAppcodeDao;
import cn.com.jandar.service.IAppcodeService;

@Transactional
@Service("appcodeService")
public class AppcodeServiceImpl implements IAppcodeService {

	@Resource
	IAppcodeDao appcodeDao;
	
	public Map<String, String> getAppcodeByType(String codetype) {
		return appcodeDao.getAppcodeByType(codetype);
	}
}
