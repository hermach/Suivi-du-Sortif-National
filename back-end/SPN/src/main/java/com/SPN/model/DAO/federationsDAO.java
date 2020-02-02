package com.SPN.model.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.SPN.model.entiteis.federations;

@Transactional
@Repository
public class federationsDAO implements i_federationsDAO {
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void  addAthlet(federations federations) {
		em.merge(federations);
	}

	@Override
	public List<federations> getAll(){
		 String jpql = "FROM federations";
		    Query query = em.createQuery(jpql);
		     List<federations> list = query.getResultList();
	         return list;
	}

	@Override
	public federations getOne(int id) {
		federations var = em.find(federations.class, id);
	    	return var;
	}

	@Override
	public void deleteOne(int id) {
		federations var = em.find(federations.class, id);
	         em.remove(var);

	}
}
