package com.ruffin.firstSpringBootApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruffin.firstSpringBootApplication.models.Session;

public interface ISessionRepository extends JpaRepository<Session, Long>{

	
	// indiquera par exemple l'interface crud pour une session
	
}
