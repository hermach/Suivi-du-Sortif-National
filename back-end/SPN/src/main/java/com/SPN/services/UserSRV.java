package com.SPN.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPN.model.DAO.i_User;
import com.SPN.model.entiteis.Users;

@Service
public class UserSRV implements i_UserSRV {
	@Autowired 
	i_User dao;
	
	@Override
	public Users findByUsername(String username) {
		return dao.findByUsername(username);
	}
}
