package com.artech.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.artech.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{

	

}
