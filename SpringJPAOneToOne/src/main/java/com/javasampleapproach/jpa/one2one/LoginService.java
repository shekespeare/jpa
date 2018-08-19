package com.javasampleapproach.jpa.one2one;

import javax.servlet.http.HttpSession;

import org.hibernate.validator.internal.metadata.facets.Validatable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.javasampleapproach.jpa.one2one.model.EssencialsLogin;
import com.javasampleapproach.jpa.one2one.repository.Loginrepository;

@Service
public class LoginService {
	
	@Autowired
	Loginrepository loginrepository;
	
	 
	public String requestType="";
	

	public ModelAndView getModelAndView(ModelAndView modelAndView, EssencialsLogin essencialsLogin,
			HttpSession session,WebRequest request) {
		    modelAndView.addObject("EssencialsLogin",essencialsLogin);
			modelAndView.setViewName("page-login");
		return modelAndView;
	}
	
	public ModelAndView postModelAndView(ModelAndView modelAndView, EssencialsLogin essencialsLogin,
			HttpSession session,WebRequest request) {
		requestType=request.getParameter("requestType");
		System.out.println("requestType->>>"+requestType);
		if(requestType.equals("login")){
		String email=essencialsLogin.getLoginEmail();
		String password=essencialsLogin.getLoginPassword();
		System.out.println("defender-111->>"+defender(password));
		System.out.println("defender-->>"+defender(loginrepository.getRepositoryId(email,password)));
		String User=defender(loginrepository.getRepositoryId(email,password));
		System.out.println("UserName-->>"+User);
		if(!User.equals("")){
			modelAndView.addObject("msg","Hello "+User);
			modelAndView.setViewName("page-login");
		}
		else{
			modelAndView.addObject("EssencialsLogin",essencialsLogin);
			modelAndView.addObject("msg","Hello please signup!!!!");
			modelAndView.setViewName("page-login");
		}
		}
		return modelAndView;
	}

	private String defender(String string) {
		
		System.out.println("string--ke aayi>>"+string);
		System.out.println("string--ke aayi-check11>>"+string != null);
		String manupulate="";
		if(string == null){
			System.out.println("string--ke aayi-check22>>"+string);
			return "";
		}else if(string.contains("'")){
			manupulate=manupulate+string.replaceAll("'", "#&");
			return manupulate;
		}else{
		return string;
		}
	}
}
