package com.ruffin.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.ruffin.model.Speaker;

// La decoration profil permet au runtime de s'executer avec une configuration particuliere

@Repository("speakerRepository")
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements IHibernateSpeakerRepository {
	
	@Autowired
	private Calendar cal;
		
	@Value("#{ T(java.lang.Math).random() * 100 }")
	private double seedNum;
	
	public List<Speaker>findAll(){
		List<Speaker> speakerList = new ArrayList<Speaker>();
		Speaker speaker = new Speaker();
		speaker.setFirstName("Bryan");
		speaker.setLastName("Hansen");
		speaker.setSeedNum(seedNum);
		System.out.println("calendrier : " + cal.getTime());
		speakerList.add(speaker);
		return speakerList;	
	}
}
