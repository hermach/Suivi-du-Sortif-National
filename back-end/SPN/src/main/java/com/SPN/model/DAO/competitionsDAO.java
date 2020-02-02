package com.SPN.model.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SPN.model.entiteis.competitions;

@Transactional
@Repository
public class competitionsDAO implements i_competitionsDAO {
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void  addone(competitions competition) {
		em.merge(competition);
	}
	@Override
	public List<competitions> getAll(){
		 String jpql = "FROM competitions";
		    Query query = em.createQuery(jpql);
		     List<competitions> list = query.getResultList();
	         return list;
	}
	@Override
	public competitions getone(int id) {
		competitions var = em.find(competitions.class, id);
	    	return var;
	}
	@Override
	public void deleteone(int id) {
		competitions var = em.find(competitions.class, id);
	         em.remove(var);

	}
}