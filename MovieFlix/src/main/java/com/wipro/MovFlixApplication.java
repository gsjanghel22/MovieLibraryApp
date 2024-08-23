package com.wipro;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.model.Movie;
import com.model.MovieRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.model")
@EnableAutoConfiguration
@EntityScan(basePackages="com.model")
@ComponentScan(basePackages="com.controller")

public class MovFlixApplication {
	
	@Autowired
	MovieRepository movieRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovFlixApplication.class, args);
	}
	
	@PostConstruct	
	public void init(){
		System.out.println("Inside save");
		Movie m1 = new Movie("M001", "The Mummy", 3000000);
		Movie m2 = new Movie("M002","The Mummy Dad",2000000);
		Movie m3 = new Movie("M003","Mr. Bean",2500000);
		Movie m4 = new Movie("M004","Logan",2500000);
		Movie m5 = new Movie("M005","The Avengers: Age of Ultron",6000000);
		Movie m6 = new Movie("M006","TopGun",2000000);
		Movie m7 = new Movie("M007","Moana",4000000);
		Movie m8 = new Movie("M008","Finding Nemo",5500000);
		Movie m9 = new Movie("M009","The Mummy Returns",9000000);
		Movie m10 = new Movie("M010","Star Wars",7000000);
		
		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		movies.add(m4);
		movies.add(m5);
		movies.add(m6);
		movies.add(m7);
		movies.add(m8);
		movies.add(m9);
		movies.add(m10);
		
		System.out.println(" before saved");
		movieRepository.saveAll(movies);
		System.out.println(" saved");
	}

}
