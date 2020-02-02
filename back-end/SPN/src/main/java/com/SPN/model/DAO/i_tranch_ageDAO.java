package com.SPN.model.DAO;

import java.util.List;

import com.SPN.model.entiteis.tranch_age;

public interface i_tranch_ageDAO {

	void addone(tranch_age tranch_age);

	List<tranch_age> getAll();

	tranch_age getone(int id);

	void deleteone(int id);

}