package com.ruffin.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ruffin.model.Speaker;
import com.ruffin.repository.IHibernateSpeakerRepository;

public class SpeakerServiceImpl implements ISpeakerService {
	
	private IHibernateSpeakerRepository hibernateSpeakerRepository;
	
	public SpeakerServiceImpl(IHibernateSpeakerRepository hibernateSpeakerRepository) {
		super();
		this.hibernateSpeakerRepository = hibernateSpeakerRepository;
		System.out.println("Constructeur SpeakerServiceImpl avec ARG hibernateSpeakerRepository ");
	}
	

	public SpeakerServiceImpl() {
		super();
		System.out.println("Constructeur SpeakerServiceImpl SANS ARGS ");
	}



	@Override
	public List<Speaker> findAll(){
		return hibernateSpeakerRepository.findAll();
	}

	@Autowired
	public void setHibernateSpeakerRepository(IHibernateSpeakerRepository hibernateSpeakerRepository) {
		System.out.println("SpeakerServiceImpl setter");
		this.hibernateSpeakerRepository = hibernateSpeakerRepository;
	}
	
};

