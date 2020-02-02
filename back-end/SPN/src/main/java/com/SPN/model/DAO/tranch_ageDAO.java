package com.SPN.model.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SPN.model.entiteis.tranch_age;

@Transactional
@Repository
public class tranch_ageDAO implements i_tranch_ageDAO {
	@PersistenceContext
	EntityManager em;
	@Override
	public void  addone(tranch_age tranch_age) {
		em.merge(tranch_age);
	}
	@Override
	public List<tranch_age> getAll(){
		 String jpql = "FROM tranch_age";
		    Query query = em.createQuery(jpql);
		     List<tranch_age> list = query.getResultList();
	         return list;
	}
	@Override
	public tranch_age getone(int id) {
		tranch_age var = em.find(tranch_age.class, id);
	    	return var;
	}
	@Override
	public void deleteone(int id) {
		tranch_age var = em.find(tranch_age.class, id);
	         em.remove(var);
	}
}
