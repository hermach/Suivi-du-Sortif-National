package com.SPN.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPN.model.DAO.i_historique_entiteDAO;
import com.SPN.model.entiteis.historique_entite;

@Service
public class historique_entiteSRV implements i_historique_entiteSRV {
	@Autowired 
	i_historique_entiteDAO dao;
	@Override
	public void addone(historique_entite historique_entite) {
		dao.addone(historique_entite);
	}
	@Override
	public List<historique_entite> getAllAthlete(int id){
		return dao.getAllAthlete(id);
	}
	@Override
	public List<historique_entite> getAll(){
		return dao.getAll();
	}
	@Override
	public historique_entite getone(int id) {
		return dao.getone(id);
	}
	@Override
	public void deleteone(int id) {
		dao.deleteone(id);
	}
}
