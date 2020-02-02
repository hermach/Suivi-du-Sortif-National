package com.SPN.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPN.model.DAO.i_criterr_valeursDAO;
import com.SPN.model.entiteis.criterr_valeurs;

@Service
public class criterr_valeursSRV implements i_criterr_valeursSRV {
	@Autowired 
	i_criterr_valeursDAO dao;
	@Override
	public void addone(criterr_valeurs criterr_valeur) {
		dao.addone(criterr_valeur);
	}
	@Override
	public List<criterr_valeurs> getAll(){
		return dao.getAll();
	}
	@Override
	public criterr_valeurs getone(int id) {
		return dao.getone(id);
	}
	@Override
	public void deleteone(int id) {
		dao.deleteone(id);
	}
}
