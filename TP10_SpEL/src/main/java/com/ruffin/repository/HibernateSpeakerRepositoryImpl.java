package com.ruffin.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.ruffin.model.Speaker;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements IHibernateSpeakerRepository {
	
	@Autowired
	private Calendar cal;
	
	// @Value pour faire du SpEL	
	
	@Value("#{ T(java.lang.Math).random() * 100 }")
	private double seedNum;
	
	public List<Speaker>findAll(){
		// declaration de la liste d'orateur (Speaker)
		List<Speaker> speakerList = new ArrayList<Speaker>();
		// Instanciation d'un speaker
		Speaker speaker = new Speaker();
		// on creer des speaker que l'on ajoute à la list
		speaker.setFirstName("Bryan");
		speaker.setLastName("Hansen");
		speaker.setSeedNum(seedNum);
		
		System.out.println("calendrier : " + cal.getTime());
		
		
		speakerList.add(speaker);
		return speakerList;	
	}
}
