package com.cg.SpringMVCDemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.SpringMVCDemo.dto.Mobile;
@Repository("mobiledao")
public class iMobileDAOImpl implements iMobileDAO{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void addMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		em.persist(mobile);
		em.flush();
		
	}

	@Override
	public List<Mobile> showAllMobile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMobile(int mobId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mobile searchMobile(int mobId) {
		// TODO Auto-generated method stub
		return null;
	}

}
