package com.SPN.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPN.model.DAO.i_entities_sportifsDAO;
import com.SPN.model.entiteis.entities_sportifs;

@Service
public class entities_sportifsSRV implements i_entities_sportifsSRV {
	@Autowired 
	i_entities_sportifsDAO dao;
	@Override
	public void addone(entities_sportifs entities_sportif) {
		dao.addone(entities_sportif);
	}
	@Override
	public List<entities_sportifs> getAll(int id){
		return dao.getAll(id);
	}
	@Override
	public entities_sportifs getone(int id) {
		return dao.getone(id);
	}
	@Override
	public void deleteone(int id) {
		dao.deleteone(id);
	}
	
	
}
