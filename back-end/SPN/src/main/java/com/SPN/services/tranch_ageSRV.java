package com.SPN.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPN.model.DAO.i_tranch_ageDAO;
import com.SPN.model.entiteis.tranch_age;

@Service
public class tranch_ageSRV implements i_tranch_ageSRV {
	@Autowired 
	i_tranch_ageDAO dao;
	
	@Override
	public void addone(tranch_age tranch_age) {
		dao.addone(tranch_age);
	}
	@Override
	public List<tranch_age> getAll(){
		return dao.getAll();
	}
	@Override
	public tranch_age getone(int id) {
		return dao.getone(id);
	}
	@Override
	public void deleteone(int id) {
		dao.deleteone(id);
	}
}
