package com.SPN.model.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SPN.model.entiteis.criterr_valeurs;
import com.SPN.model.entiteis.journal_performs;

@Transactional
@Repository
public class journal_performsDAO implements i_journal_performsDAO {
	@PersistenceContext
	EntityManager em;
	@Override
	public void  addone(journal_performs journal_perform) {	
	em.merge(journal_perform);
	}
	@Override
	public List<journal_performs> getAll(){
		 String jpql = "FROM journal_performs";
		    Query query = em.createQuery(jpql);
		     List<journal_performs> list = query.getResultList();
	         return list;
	}
	@Override
	public List<journal_performs> getAllPerAth(int id){
		 String jpql = "FROM journal_performs as a where a.athlete.id="+id;
		    Query query = em.createQuery(jpql);
		     List<journal_performs> list = query.getResultList();
	         return list;
	}
	@Override
	public journal_performs getone(int id) {
		journal_performs var = em.find(journal_performs.class, id);
	    	return var;
	}
	@Override
	public void deleteone(int id) {
		journal_performs var = em.find(journal_performs.class, id);
	         em.remove(var);
	}
	
}
