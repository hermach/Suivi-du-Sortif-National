package com.SPN.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPN.model.DAO.i_competition_de_federationDAO;
import com.SPN.model.entiteis.competition_de_federation;
import com.SPN.model.entiteis.competitions;

@Service
public class competition_de_federationSRV implements i_competition_de_federationSRV {
	@Autowired 
	i_competition_de_federationDAO dao;
	
	@Override
	public void add(competition_de_federation competition_de_federation, competitions competition) {
		dao.add(competition_de_federation,competition);
	}
	@Override
	public List<competition_de_federation> getAll(){
		return dao.getAll();
	}
	@Override
	public List<competitions> get(int id){
		return dao.get(id);
	}
	@Override
	public competition_de_federation getone(int id) {
		return dao.getone(id);
	}
	@Override
	public void deleteone(int id) {
		dao.deleteone(id);
	}
}
