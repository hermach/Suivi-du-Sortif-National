package com.SPN.model.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SPN.model.entiteis.criterr_valeurs;

@Transactional
@Repository
public class criterr_valeursDAO implements i_criterr_valeursDAO {
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void  addone(criterr_valeurs criterr_valeur) {
		em.merge(criterr_valeur);
	}
	@Override
	public List<criterr_valeurs> getAll(){
		 String jpql = "FROM criterr_valeurs";
		    Query query = em.createQuery(jpql);
		     List<criterr_valeurs> list = query.getResultList();
	         return list;
	}
	@Override
	public criterr_valeurs getone(int id) {
		criterr_valeurs var = em.find(criterr_valeurs.class, id);
	    	return var;
	}
	@Override
	public void deleteone(int id) {
		criterr_valeurs var = em.find(criterr_valeurs.class, id);
	         em.remove(var);
	}
}
