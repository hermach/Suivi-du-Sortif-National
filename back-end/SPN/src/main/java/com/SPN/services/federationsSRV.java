package com.SPN.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPN.model.DAO.i_federationsDAO;
import com.SPN.model.entiteis.federations;

@Service
public class federationsSRV implements i_federationsSRV {
	@Autowired 
    i_federationsDAO dao;
	
	@Override
	public void addAthlet(federations federations) {
		dao.addAthlet(federations);
	}
	@Override
	public List<federations> getAll(){
		return dao.getAll();
	}
	@Override
	public federations getOne(int id) {
		return dao.getOne(id);
	}
	@Override
	public void deleteOne(int id) {
		dao.deleteOne(id);
	}
}
