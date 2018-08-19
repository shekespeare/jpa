//package com.javasampleapproach.jpa.one2one;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.codehaus.jettison.json.JSONException;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.javasampleapproach.jpa.one2one.repository.HusbandImpl;
//import com.javasampleapproach.jpa.one2one.repository.WifeRepository;
//
//@org.springframework.stereotype.Service
//public class Service {
//	@Autowired
//	WifeRepository wifeRepository;
//	@Autowired
//	HusbandImpl husbandImpl;
//	
//	String  name="";
//	String  id="";
//	String requestType="";
//	Map output=null;
//	org.codehaus.jettison.json.JSONObject inputjson =null;
//	
//	public Map serviceMethod(String input) throws JSONException{
//		output=new HashMap();
//		inputjson =new org.codehaus.jettison.json.JSONObject(input);
//		System.out.println("inputjson==============="+inputjson);
//		if(!inputjson.isNull("name")){
//		name=inputjson.getString("name");
//		}
//		Wife wife=new Wife();
//		wife.setName(name);
//		String lisaId = wifeRepository.save(wife).getId() + "";
//		if(!lisaId.equals("0")&& requestType.equals("add")){
//			output.put("lisaId", lisaId);
//			output.put("successmsg", "successfully Added!!");
//		}else if(!lisaId.equals("0")&& requestType.equals("add"))
//		{
//			output.put("lisaId", lisaId);
//			output.put("successmsg", "successfully updated!!");
//		}
//		System.out.println("output==============="+output);
//		return output;
//	}
//
//	public Map serviceWifeDetails(String input) throws JSONException {
//		output=new HashMap();
//		inputjson =new org.codehaus.jettison.json.JSONObject(input);
//		System.out.println("inputjson==============="+inputjson);
//		if(!inputjson.isNull("id")){
//			id=inputjson.getString("id");
//			List<Wife> wife=husbandImpl.wifeDetail(Integer.parseInt(id));
//			for (Wife obj : wife) {
//				output.put("wifeName", obj.getName());
//				output.put("husbandName", obj.getHname());
//			}
//		}
//		return output;
//	}
//
//}
