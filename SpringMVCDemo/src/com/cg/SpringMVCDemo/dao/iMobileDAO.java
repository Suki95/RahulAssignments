package com.cg.SpringMVCDemo.dao;

import java.util.List;

import com.cg.SpringMVCDemo.dto.Mobile;

public interface iMobileDAO {
	
	public void addMobile(Mobile mobile);
	public List<Mobile> showAllMobile();
	public void deleteMobile(int mobId);
	public Mobile searchMobile(int mobId);

}
