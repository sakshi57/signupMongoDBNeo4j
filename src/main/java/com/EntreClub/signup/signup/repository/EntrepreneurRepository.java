package com.EntreClub.signup.signup.repository;

//import com.javatechie.spring.neo4j.api.node.Entrepreneur;

import com.EntreClub.signup.signup.model.Entrepreneur;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface EntrepreneurRepository extends Neo4jRepository<Entrepreneur, String> {
	//Entrepreneur findByName(String name);
}
