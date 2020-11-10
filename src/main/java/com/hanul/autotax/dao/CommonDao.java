package com.hanul.autotax.dao;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommonDao {
	private Logger logger = Logger.getLogger(CommonDao.class);
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public List getAllCustomer(){
		List userList = null;
		try {
			userList = sqlSession.selectList("com.hanul.autotax.dao.getAllCustomer");
		}catch(Exception e) {
			e.printStackTrace();			
		}				
		return userList;
	}
	
	
	public Map getCustomerById(Map param){
		Map customer = null;
		try {
			customer = sqlSession.selectOne("com.hanul.autotax.dao.getCustomerById",param);
		}catch(Exception e) {
			e.printStackTrace();			
		}				
		return customer;
	}	

}
