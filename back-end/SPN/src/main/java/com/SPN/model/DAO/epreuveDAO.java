package com.SPN.model.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SPN.model.entiteis.Epreuve_competition;
import com.SPN.model.entiteis.epreuve;

@Transactional
@Repository
public class epreuveDAO implements i_epreuveDAO {
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void  addathlet(epreuve epreuve,Epreuve_competition epreuve_competition) {
		epreuve ss =  em.merge(epreuve);
		epreuve_competition.setEpreuve(ss);
		em.merge(epreuve_competition);
	}

	@Override
	public List<epreuve> getAll(){
		 String jpql = "FROM epreuve";
		    Query query = em.createQuery(jpql);
		     List<epreuve> list = query.getResultList();
	         return list;
	}

	@Override
	public epreuve getone(int id) {
		epreuve var = em.find(epreuve.class, id);
	    	return var;
	}

	@Override
	public void deleteone(int id) {
		epreuve var = em.find(epreuve.class, id);
	         em.remove(var);

	}
}
