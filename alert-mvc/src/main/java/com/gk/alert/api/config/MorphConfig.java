package com.gk.alert.api.config;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.mongodb.MongoClient;

@Configuration
@PropertySource(value="classpath:application.properties")
@ComponentScan
public class MorphConfig {

	@Autowired
	private Environment env;
	
	@Bean
	public Datastore getDatastore(){
		Morphia morphia=new Morphia();
		MongoClient mongoClient= new MongoClient(env.getProperty("mongo.host"));
		return morphia.createDatastore(mongoClient, env.getProperty("mongo.dbname"));
	}
}
