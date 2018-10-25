package com.cg.SpringMVCDemo.service;

import java.util.List;

import com.cg.SpringMVCDemo.dto.Mobile;

public interface iMobileService {
	
	public void addMobile(Mobile mobile);
	public List<Mobile> showAllMobile();
	public void deleteMobile(int mobId);
	public Mobile searchMobile(int mobId);

}
