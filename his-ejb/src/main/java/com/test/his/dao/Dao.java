package com.test.his.dao;

import java.util.List;

import com.test.his.model.AbstractEntity;

public interface Dao<E extends AbstractEntity> {

	void persist(E instance);

	E find(long id);

	void remove(E instance);

	E merge(E instance);

	List<E> findAll();

}
