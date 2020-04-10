package com.ruffin.repository;

import java.util.List;

import com.ruffin.model.Speaker;

public interface IHibernateSpeakerRepository {
	List<Speaker> findAll();

}