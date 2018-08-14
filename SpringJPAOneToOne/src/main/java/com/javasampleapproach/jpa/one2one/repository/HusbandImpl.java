package com.javasampleapproach.jpa.one2one.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.javasampleapproach.jpa.one2one.Wife;


@Repository
public class HusbandImpl {
	
	@PersistenceContext
	EntityManager em;

	public List<Wife> wifeDetail(int id) {
		
		TypedQuery<Wife> ty=null;
		List<Wife> wife =new ArrayList<>();
		
	String sqlquery=" SELECT new Wife( "
			+ " w.name,"
			+ " w.husband.name as hname ) "
			+ " FROM "
			+ " Wife w "
			+ " INNER JOIN w.husband "
			+ " where w.husband.id= "
			+id;
	wife=em.createQuery(sqlquery, Wife.class).getResultList();
//       wife =ty.getsin;
		return wife;
	}
	

}
