package com.ruffin.repository;

import java.util.List;

import com.ruffin.model.Speaker;

// contrat d'interface 
public interface IHibernateSpeakerRepository {

	List<Speaker> findAll();

}