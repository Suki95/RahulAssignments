package com.cg.SpringMVCDemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
		Query query=em.createQuery("FROM Mobile");
		List<Mobile> myAll=query.getResultList();
		return myAll;
	}

	@Override
	public void deleteMobile(int mobId) {
		// TODO Auto-generated method stub
		Query querySearch=em.createQuery("DELETE FROM Mobile WHERE mobId=:mobdata");
		querySearch.setParameter("mobdata", mobId);
		querySearch.executeUpdate();
		
		
	}

	@Override
	public Mobile searchMobile(int mobId) {
		// TODO Auto-generated method stub
		Query querySearch=em.createQuery("FROM Mobile WHERE mobId=:mobdata");
		querySearch.setParameter("mobdata", mobId);
		Mobile mob=(Mobile) querySearch.getResultList().get(0);
		return mob;
	}

}
