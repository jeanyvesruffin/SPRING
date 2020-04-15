package com.ruffin.firstSpringBootApplication.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// configuration full java

@Configuration
public class PersistenceConfiguration {
	
	@Bean
	public DataSource dataSource() {
		@SuppressWarnings("rawtypes")
		DataSourceBuilder builder = DataSourceBuilder.create();
		builder.url("jdbc:postgresql://localhost:5432/spring");
		builder.username("postgres");
		builder.password("root");
		System.out.println("Mon bean de source de données personnalisé a été initialisé et défini");
		return builder.build();
	}
}
