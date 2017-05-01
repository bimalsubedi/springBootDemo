package com.bimal.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
public interface TeamDao extends CrudRepository<Team, Long>{
	List<Team> findAll();
	Team findByName(String name);

}
