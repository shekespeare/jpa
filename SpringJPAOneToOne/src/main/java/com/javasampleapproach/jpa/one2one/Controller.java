package com.javasampleapproach.jpa.one2one;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.codehaus.jettison.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.javasampleapproach.jpa.one2one.model.EssencialsLogin;

@RestController
@RequestMapping("/home")
public class Controller {

	
//	@Autowired
//	Service service;

	@Autowired
	LoginService loginService;

	
	@GetMapping("/test")
	public String first() {

		return "Test Successfull";

	}

//	@GetMapping("/entry")
//	public String entry() {
//		Wife lisa = new Wife("Lisa", new Husband("David"));
//		String lisaId = wifeRepository.save(lisa).getId() + "";
//		return lisaId;
//
//	}
	
	@GetMapping("/login")
	public ModelAndView login(ModelAndView modelAndView,@ModelAttribute("EssencialsLogin") EssencialsLogin essencialsLogin,HttpSession session,WebRequest request){
		System.out.println("id-->>>"+essencialsLogin.getLoginId());
		return loginService.getModelAndView(modelAndView,essencialsLogin,session,request);
		
	}
	
	@PostMapping("/login")
	public ModelAndView postlogin(ModelAndView modelAndView,@ModelAttribute("EssencialsLogin") EssencialsLogin essencialsLogin,HttpSession session,WebRequest request){
		System.out.println("id-->>>"+essencialsLogin.getLoginId());
		return loginService.postModelAndView(modelAndView,essencialsLogin,session,request);
		
	}

//	@PostMapping("/entry")
//	public Map entry(@RequestBody String input) throws JSONException {
//		return service.serviceMethod(input);
//	}
//	
//	@PostMapping("/wifeDetails")
//	public Map wifeDetails(@RequestBody String input) throws JSONException {
//		return service.serviceWifeDetails(input);
//	}


}
