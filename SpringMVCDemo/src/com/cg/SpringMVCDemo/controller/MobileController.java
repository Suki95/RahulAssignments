package com.cg.SpringMVCDemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.SpringMVCDemo.dto.Mobile;
import com.cg.SpringMVCDemo.service.iMobileService;

@Controller
public class MobileController {
	
	@Autowired
	iMobileService mobileservice;
	
	@RequestMapping(value="/home")
	public String getAllMobile(@ModelAttribute("my") Mobile mob,Map<String,Object> model){
		
		List<String> myList=new ArrayList<String>();
		myList.add("Android");
		myList.add("iPhone");
		myList.add("Windows");
				
		model.put("cato", myList);
		
		return "AddMobile";
		
	}
	
	@RequestMapping(value="/adddata",method=RequestMethod.POST)
	public String addMobileData(@ModelAttribute("my") Mobile mobile){
		
		//System.out.println(mobile.getMobId()+" "+mobile.getMobName()+" "+mobile.getMobPrice()+" "+mobile.getMobCategory());
		//System.out.println(mobile.getMobOnline());
		mobileservice.addMobile(mobile);
		return "success";
	}

	
}
