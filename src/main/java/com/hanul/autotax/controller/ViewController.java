package com.hanul.autotax.controller;

import java.util.Map;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hanul.autotax.dao.CommonDao;


@Controller
@RequestMapping(value="/")
public class ViewController {
	private Logger logger = Logger.getLogger(ViewController.class);
	
	@Autowired
	private CommonDao commonDao;
	
	@RequestMapping(value="/main")
	String goMain() throws Exception{	
		return "main";		
	}	
	
	@RequestMapping(value="/caseList")
	String getAllCaseList(@RequestParam Map param,ModelMap model) throws Exception{	
		
		logger.debug(param.toString());
		List<Map> caseList = commonDao.getAllCaseList(param);
		
	    model.put("caseList", caseList);
	
		return "test";	
	}		
}
