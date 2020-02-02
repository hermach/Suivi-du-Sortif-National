package com.SPN.model.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SPN.model.entiteis.criteres;

@Transactional
@Repository
public class criteresDAO implements i_criteresDAO {
	@PersistenceContext
	EntityManager em;
	@Override
	public void  addone(criteres critere) {
		em.merge(critere);
	}
	@Override
	public List<criteres> getAll(){
		 String jpql = "FROM criteres";
		    Query query = em.createQuery(jpql);
		     List<criteres> list = query.getResultList();
	         return list;
	}
	@Override
	public List<criteres> getAllcriter_de_sport(int id){
		 String jpql = "FROM criteres as a where a.sport.id="+id;
		    Query query = em.createQuery(jpql);
		     List<criteres> list = query.getResultList();
	         return list;
	}
	@Override
	public criteres getone(int id) {
		criteres var = em.find(criteres.class, id);
	    	return var;
	}
	@Override
	public void deleteone(int id) {
		criteres var = em.find(criteres.class, id);
	         em.remove(var);
	}
	
}
