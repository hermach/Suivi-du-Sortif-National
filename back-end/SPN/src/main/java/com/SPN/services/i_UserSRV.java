package com.SPN.services;

import com.SPN.model.entiteis.Users;

public interface i_UserSRV {

	public Users findByUsername(String username);

}