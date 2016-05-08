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
	
	public Movie addMovie(String name, Set<String> actors){
		//Create new movie and add to the DB
		if (movies.containsKey(name)){
			throw new IllegalArgumentException(name + " already exists in DB");
		}
		//Movie movie = new Movie(name, actors);
		movies.put(name, new Movie(name, actors));
		return movies.get(name);
	}
	
	public void addMovie(){
		Movie movie = new Movie();
		movies.put(movie.getName(), movie);
	}
	
	public Collection<Movie> getAll(){
		//Return Collection of all Movies
		return movies.values();
	}
	
	public double vote(String name, int voting){
		//send a single vote for a movie. Returns the new calculated rank.
		movies.get(name).updateRank(voting);
		return movies.get(name).getRank();
	}
	
	public List<Movie> getTop(int number){
		List<Movie> movieList = new ArrayList<>(movies.values());
		Collections.sort(movieList, (m1, m2) -> {
			if (m1.getRank() < m2.getRank()) return 1;
			if (m1.getRank() > m2.getRank()) return -1;
			return 0;			
		});
		//List<Movie> topList = new ArrayList<Movie>(number);
//		for (Movie movie : movieList) {
//			topList.add(movie);
//		}
//		Iterator<Movie> iter = movieList.iterator();
//		for (int i =0; i < number; i++) {
//			topList.add(iter.next());
//		}
		return movieList.subList(0, number);
	}
	
}
