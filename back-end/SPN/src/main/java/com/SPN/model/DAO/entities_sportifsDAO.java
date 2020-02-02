package com.SPN.model.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SPN.model.entiteis.entities_sportifs;

@Transactional
@Repository
public class entities_sportifsDAO implements i_entities_sportifsDAO {
	@PersistenceContext
	EntityManager em;
	@Override
	public void  addone(entities_sportifs entities_sportif) {
		em.merge(entities_sportif);
	}
	@Override
	public List<entities_sportifs> getAll(int id){
		 String jpql = "FROM entities_sportifs as a where a.sport.id="+id;
		    Query query = em.createQuery(jpql);
		     List<entities_sportifs> list = query.getResultList();
	         return list;
	}
	@Override
	public entities_sportifs getone(int id) {
		entities_sportifs var = em.find(entities_sportifs.class, id);
	    	return var;
	}
	@Override
	public void deleteone(int id) {
		entities_sportifs var = em.find(entities_sportifs.class, id);
	         em.remove(var);
	}
}
