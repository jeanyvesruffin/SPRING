package com.ruffin.service;


import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruffin.model.Speaker;
import com.ruffin.repository.IHibernateSpeakerRepository;

@Service("speakerService")
public class SpeakerServiceImpl implements ISpeakerService {
	
	private IHibernateSpeakerRepository hibernateSpeakerRepository;
	
	@Autowired
	public SpeakerServiceImpl(IHibernateSpeakerRepository hibernateSpeakerRepository) {
		super();
		this.hibernateSpeakerRepository = hibernateSpeakerRepository;
		System.out.println("Constructeur SpeakerServiceImpl avec ARG hibernateSpeakerRepository ");
	}
	

	public SpeakerServiceImpl() {
		super();
		System.out.println("Constructeur SpeakerServiceImpl SANS ARGS ");
	}

	@PostConstruct
	private void initialize() {
		System.out.println("Nous sommes appelé après le constructeur");
	}
	
	public List<Speaker> findAll(){
		return hibernateSpeakerRepository.findAll();
	}

	@Autowired
	public void setHibernateSpeakerRepository(IHibernateSpeakerRepository hibernateSpeakerRepository) {
		System.out.println("SpeakerServiceImpl setter");
		this.hibernateSpeakerRepository = hibernateSpeakerRepository;
	}
	
};

