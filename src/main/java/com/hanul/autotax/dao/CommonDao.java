package com.hanul.autotax.dao;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CommonDao {
	private Logger logger = Logger.getLogger(CommonDao.class);
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	
	public List<Map> getAllCaseList(Map param) throws Exception{
		List<Map> cases = null;
		cases = sqlSession.selectList("com.hanul.autotax.dao.getAllCaseList",param);				
		return cases;
	}	
	
	@Transactional
	public List getAllCustomer() throws Exception{
		List userList = null;
		int cnt = sqlSession.update("com.hanul.autotax.dao.updateTest");
		userList = sqlSession.selectList("com.hanul.autotax.dao.getAllCustomer");
			
		return userList;
	}
	
	
	public Map getCustomerById(Map param) throws Exception{
		Map customer = null;
		customer = sqlSession.selectOne("com.hanul.autotax.dao.getCustomerById",param);
				
		return customer;
	}	

}
