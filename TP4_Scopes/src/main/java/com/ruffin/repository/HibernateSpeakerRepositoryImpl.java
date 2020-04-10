package com.ruffin.repository;

import java.util.ArrayList;
import java.util.List;

import com.ruffin.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements IHibernateSpeakerRepository {
	
	@Override
	public List<Speaker>findAll(){
		// declaration de la liste d'orateur (Speaker)
		List<Speaker> speakerList = new ArrayList<Speaker>();
		// Instanciation d'un speaker
		Speaker speaker = new Speaker();
		// on creer des speaker que l'on ajoute à la list
		speaker.setFirstName("Bryan");
		speaker.setLastName("Hansen");
		speakerList.add(speaker);
		return speakerList;	
	}
}
