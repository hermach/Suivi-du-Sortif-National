package com.SPN.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPN.model.DAO.i_epreuveDAO;
import com.SPN.model.entiteis.Epreuve_competition;
import com.SPN.model.entiteis.epreuve;

@Service
public class epreuveSRV implements i_epreuveSRV {
	@Autowired 
   i_epreuveDAO dao;
	@Override
   public void  addathlet(epreuve epreuve,Epreuve_competition epreuve_competition){
		dao.addathlet(epreuve,epreuve_competition);
	}
	@Override
	public List<epreuve> getAll(){
		return dao.getAll();
	}
	@Override
	public epreuve getone(int id) {
		return dao.getone(id);
	}
	@Override
	public void deleteone(int id) {
		dao.deleteone(id);
	}
}
