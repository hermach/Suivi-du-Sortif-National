package com.SPN.model.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SPN.model.entiteis.competition_de_federation;
import com.SPN.model.entiteis.competitions;

@Transactional
@Repository
public class competition_de_federationDAO implements i_competition_de_federationDAO {
	@PersistenceContext
	EntityManager em;
	
	
	@Override
	public void  add(competition_de_federation competition_de_federation, competitions competition) {
		competitions comp = em.merge(competition);
		competition_de_federation.setCompetition(comp);
		em.merge(competition_de_federation);
	}

	@Override
	public List<competition_de_federation> getAll(){
		 String jpql = "FROM competition_de_federation";
		    Query query = em.createQuery(jpql);
		     List<competition_de_federation> list = query.getResultList();
	         return list;
	}
	@Override
	public List<competitions> get(int id){
		 String jpql = "select competition FROM competition_de_federation as a where a.federation.id="+id;
		    Query query = em.createQuery(jpql);
		     List<competitions> list = query.getResultList();
	         return list;
	}

	@Override
	public competition_de_federation getone(int id) {
		   competition_de_federation var = em.find(competition_de_federation.class, id);
	    	return var;
	}

	@Override
	public void deleteone(int id) {
		   competition_de_federation var = em.find(competition_de_federation.class, id);
	         em.remove(var);

	}
}
