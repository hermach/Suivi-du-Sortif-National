package com.SPN.model.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SPN.model.entiteis.entities_sportifs;
import com.SPN.model.entiteis.historique_entite;

@Transactional
@Repository
public class historique_entiteDAO implements i_historique_entiteDAO {
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void  addone(historique_entite historique_entite) {
		em.merge(historique_entite);
	}
	@Override
	public List<historique_entite> getAllAthlete(int id){
		 String jpql =
		"select athlete FROM historique_entite as a where a.date_de_fin=NULL AND a.entite_sportif.id = "+id;
		 Query query = em.createQuery(jpql);
		 List<historique_entite> list = query.getResultList();
	         return list;
	}
	@Override
	public List<historique_entite> getAll(){
		 String jpql = "FROM historique_entite";
		    Query query = em.createQuery(jpql);
		     List<historique_entite> list = query.getResultList();
	         return list;
	}
	
//	public entities_sportifs getonesport(int id) {
//		 String jpql = "select entite_sportif FROM historique_entite as a where a.athlete.id="+id;
//		    Query query = em.createQuery(jpql);
//		    Object tt = query.getSingleResult();
//		    return tt;
//	}
	
	@Override
	public historique_entite getone(int id) {
		historique_entite var = em.find(historique_entite.class, id);
	    	return var;
	}
	@Override
	public void deleteone(int id) {
		historique_entite var = em.find(historique_entite.class, id);
	         em.remove(var);
	}
	
}
