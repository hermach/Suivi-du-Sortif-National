package com.SPN.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPN.model.DAO.i_athleteDAO;
import com.SPN.model.entiteis.athletes;
import com.SPN.model.entiteis.historique_entite;
@Service
public class athleteSRV implements i_athleteSRV {
	@Autowired 
	i_athleteDAO dao;
	@Override
	public athletes addathlet(athletes athlete, historique_entite historique_entite) {
		return dao.addathlet(athlete,historique_entite);
	}
	@Override
	public List<athletes> getAll(){
		return dao.getAll();
	}
	
	@Override
	public athletes getone(int id) {
		return dao.getone(id);
	}
	@Override
	public void deleteone(int id) {
		dao.deleteone(id);
	}
	
//	public void addathlet(athletes athle, historique_entite historique_entit) {
//		dao.addathlet(athle);
//		historique_entite qq = new historique_entite(historique_entit.getEntite_sportif(),athle , historique_entit.getDate_de_debut(), historique_entit.getDate_de_fin());
//		dao1.addone(qq);
//	}
}
