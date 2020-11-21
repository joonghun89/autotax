package com.hanul.autotax.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
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
	
	@RequestMapping(value="/dashboard")
	String dashboard() throws Exception{	
		return "dashboard";		
	}	
	
	@RequestMapping(value="/caseList")
	String caseList() throws Exception{	
		return "caseList";		
	}	
	
	@RequestMapping(value="/caseView")
	String caseView() throws Exception{	
		return "caseView";		
	}		
	
	@RequestMapping(value="/caseModify")
	String caseModify() throws Exception{	
		return "caseModify";		
	}		
	
	@RequestMapping(value="/caseWrite")
	String caseWrite() throws Exception{	
		return "caseWrite";		
	}		
	
	
	@RequestMapping(value="/customerList")
	String customerList() throws Exception{	
		return "customerList";		
	}	
		
	
	@RequestMapping(value="/customerModify")
	String customerModify() throws Exception{	
		return "customerModify";		
	}		
	
	@RequestMapping(value="/customerWrite")
	String customerWrite() throws Exception{	
		return "customerWrite";		
	}		
	
	@RequestMapping(value="/macrosList")
	String macrosList() throws Exception{	
		return "macrosList";		
	}		
	
	
	@RequestMapping(value="/statisticsList")
	String statisticsList() throws Exception{	
		return "statisticsList";		
	}	
	
	
	@RequestMapping(value="/accountWrite")
	String accountWrite() throws Exception{	
		return "accountWrite";		
	}	
	

	@RequestMapping(value="/accountView")
	String accountView() throws Exception{	
		return "accountView";		
	}		
	
	@RequestMapping(value="/accountModify")
	String accountModify() throws Exception{	
		return "accountModify";		
	}
	
	@RequestMapping(value="/cardWrite")
	String cardWrite() throws Exception{	
		return "cardWrite";		
	}
	
	@RequestMapping(value="/cardView")
	String cardView() throws Exception{	
		return "cardView";		
	}	
	
	@RequestMapping(value="/cardModify")
	String cardModify() throws Exception{	
		return "cardModify";		
	}		
	
	@RequestMapping(value="/login")
	String login() throws Exception{	
		return "login";		
	}		
	
	@RequestMapping(value="/join")
	String join() throws Exception{	
		return "join";		
	}	
	
	@RequestMapping(value="/findPwd")
	String findPwd() throws Exception{	
		return "findPwd";		
	}		
	
	@RequestMapping(value="/resetPwd")
	String resetPwd() throws Exception{	
		return "resetPwd";		
	}		
	
	@RequestMapping(value="/test")
	String test() throws Exception{	
		return "test";		
	}	
	
	@RequestMapping(value="/doLogin")
	String doLogin(HttpServletRequest request, @RequestParam Map param,ModelMap model) throws Exception{	
		
		logger.debug(param.toString());
		Map userInfo = commonDao.getUserInfo(param);
		if(userInfo != null) {
			model.put("userInfo", userInfo);
			request.getSession().setAttribute("userInfo",userInfo);
			return "test";				
		}else {
			return "dashboard";	
		}
	    
	
		
	}		
	
	@RequestMapping(value="/getAllCaseList")
	String getAllCaseList(@RequestParam Map param,ModelMap model) throws Exception{	
		
		logger.debug(param.toString());
		List<Map> caseList = commonDao.getAllCaseList(param);
		
	    model.put("caseList", caseList);
	
		return "test";	
	}		
}
