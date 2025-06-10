package com.test.his.dao;

import javax.ejb.Local;

import com.test.his.model.User;

@Local
public interface UserDao extends Dao<User> {

	String NAME = "userDao";
	String JNDI_NAME = "java:app/his-ejb/UserDaoBean";

	User findByUsername(String username);

}
