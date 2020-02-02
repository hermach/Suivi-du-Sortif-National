package com.SPN.model.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SPN.model.entiteis.journal_sante;

@Transactional
@Repository
public class journal_santeDAO implements i_journal_santeDAO {
	@PersistenceContext
	EntityManager em;
	@Override
	public void  addone(journal_sante journal_sante) {
		em.merge(journal_sante);
	}
	@Override
	public List<journal_sante> getAllJournalSante(int id){
		 String jpql =
				 "FROM journal_sante as a where a.athlete.id ="+id;
		    Query query = em.createQuery(jpql);
		     List<journal_sante> list = query.getResultList();
	         return list;
	}
	@Override
	public List<journal_sante> getAll(){
		 String jpql = "FROM journal_sante";
		    Query query = em.createQuery(jpql);
		     List<journal_sante> list = query.getResultList();
	         return list;
	}
	@Override
	public journal_sante getone(int id) {
		journal_sante var = em.find(journal_sante.class, id);
	    	return var;
	}
	@Override
	public void deleteone(int id) {
		journal_sante var = em.find(journal_sante.class, id);
	         em.remove(var);
	}
}
