package com.netanel.imdb;

import java.util.*;

public class IMDB {
	//
	// Attributes
	//
	private Map<String, Movie> movies = new HashMap<>();
	
	//
	// Constructors
	//
	public IMDB() {}
	
	//
	// Functions
	//
	public Map<String, Movie> getMovies() {
		return movies;
	}
	
	public void addMovie(String name, Set<String> actors){
		//Create new movie and add to the DB
		if (movies.containsKey(name)){
			throw new IllegalArgumentException(name + " already exists in DB");
		}
		Movie movie = new Movie(name, actors);
		movies.put(name, movie);
	}
	
	public Collection<Movie> getAll(){
		//Return Collection of all Movies
		return movies.values();
	}
	
	public double vote(String name, int voting){
		movies.get(name).updateRank(voting);
		return movies.get(name).getRank();
	}
	
}
