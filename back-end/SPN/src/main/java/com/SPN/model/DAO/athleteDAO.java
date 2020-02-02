package com.SPN.model.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SPN.model.entiteis.athletes;
import com.SPN.model.entiteis.historique_entite;

@Transactional
@Repository
public class athleteDAO implements i_athleteDAO {
	@PersistenceContext
	EntityManager em;
	

	@Override
	public athletes  addathlet(athletes athlete, historique_entite historique_entite) {
		athletes at=em.merge(athlete);
	  historique_entite.setAthlete(at);
	  em.merge(historique_entite);
	  
		return athlete;
		
	}

	@Override
	public List<athletes> getAll(){
		 String jpql = "FROM athletes";
		    Query query = em.createQuery(jpql);
		     List<athletes> list = query.getResultList();
	         return list;
	}

	@Override
	public athletes getone(int id) {
		   athletes var = em.find(athletes.class, id);
	    	return var;
	}

	@Override
	public void deleteone(int id) {
		   athletes var = em.find(athletes.class, id);
	         em.remove(var);

	}
}
