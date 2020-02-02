package com.SPN.model.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SPN.model.entiteis.sports;

@Transactional
@Repository
public class sportsDAO implements i_sportsDAO {
	@PersistenceContext
	EntityManager em;
	@Override
	public void  addone(sports sport) {
		em.merge(sport);
	}
	@Override
	public List<sports> getAll(){
		 String jpql = "FROM sports";
		    Query query = em.createQuery(jpql);
		     List<sports> list = query.getResultList();
	         return list;
	}
	@Override
	public sports getone(int id) {
		sports var = em.find(sports.class, id);
	    	return var;
	}
	@Override
	public void deleteone(int id) {
		sports var = em.find(sports.class, id);
	         em.remove(var);
	}
}
