package com.javasampleapproach.jpa.one2one;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jettison.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.jpa.one2one.repository.HusbandImpl;
import com.javasampleapproach.jpa.one2one.repository.WifeRepository;

@RestController
@RequestMapping("/home")
public class Controller {

	
	@Autowired
	Service service;

	
	
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

	@PostMapping("/entry")
	public Map entry(@RequestBody String input) throws JSONException {
		return service.serviceMethod(input);
	}
	
	@PostMapping("/wifeDetails")
	public Map wifeDetails(@RequestBody String input) throws JSONException {
		return service.serviceWifeDetails(input);
	}


}
