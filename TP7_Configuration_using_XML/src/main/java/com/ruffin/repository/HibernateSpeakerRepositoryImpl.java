package com.ruffin.repository;

import java.util.ArrayList;
import java.util.List;

import com.ruffin.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements IHibernateSpeakerRepository {
	
	@Override
	public List<Speaker>findAll(){
		List<Speaker> speakerList = new ArrayList<Speaker>();
		Speaker speaker = new Speaker();
		speaker.setFirstName("Bryan");
		speaker.setLastName("Hansen");
		speakerList.add(speaker);
		return speakerList;	
	}
}
