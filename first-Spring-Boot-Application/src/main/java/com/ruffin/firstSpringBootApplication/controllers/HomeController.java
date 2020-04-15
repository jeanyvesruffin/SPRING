package com.ruffin.firstSpringBootApplication.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	// @RequestMapping("/") ===> Root
	// on ajoute une variable version representative de la version de notre app
	// Rappel @value Spring Expression Language
	
	@Value("${app.version}")
	private String appVersion;
	
	
	@GetMapping
	@RequestMapping("/")
	public Map<String, String> getStatus() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("app-version", appVersion);
		return map;
	}
}
