package com.example.demo.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Couponsdao extends CrudRepository<Couponsdao ,Serializable> {

	
	public default List<Couponsdao> findBycompany(String company) {
		// TODO Auto-generated method stub
		return null;
	}
}
