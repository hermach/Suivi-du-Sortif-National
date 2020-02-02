package com.SPN.model.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SPN.model.entiteis.Users;

public interface i_User extends JpaRepository<Users, Integer>{

public Users findByUsername(String username);
}