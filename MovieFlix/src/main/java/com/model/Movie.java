package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="moviedetails")
@Table(name="moveidetails")
public class Movie {

	@Id
	private String movieId;
	private String movieName;
	private long movieCollection;

	public Movie() {
		
	}

	public Movie(String movieId, String movieName, long movieCollection) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieCollection = movieCollection;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public long getMovieCollection() {
		return movieCollection;
	}

	public void setMovieCollection(long movieCollection) {
		this.movieCollection = movieCollection;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieCollection=" + movieCollection + "]";
	}

}
