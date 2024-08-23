package com.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MovieRepository extends JpaRepository<Movie,String>{
	
	  @Query(value="Select md from moviedetails md where movieName LIKE '%movieName%'")
	  public List<Movie> findBymovieNameLike(String movieName);
	
	
	  @Query(value="Select md from moviedetails md where movieCollection>=:value1 AND movieCollection<=:value2")
	  public List<Movie> findByCollection(@Param("value1") long movieCollection1,
	  @Param("value2")long movieCollection2);
	  
	 
}
