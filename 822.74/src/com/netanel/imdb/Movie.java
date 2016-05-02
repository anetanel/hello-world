package com.netanel.imdb;

import java.util.Set;

public class Movie {
	//
	// Attributes
	//
	private String name = "Untitled Movie";
	private Set<String> actors;
	private double rank;
	private int numOfVoters;
	
	
	//
	// Constructors
	//
	public Movie() {}

	public Movie(String name, Set<String> actors) {
		this.name = name;
		this.actors = actors;
	}

	//
	// Getters
	//
	public String getName() {
		return name;
	}

	public Set<String> getActors() {
		return actors;
	}

	public double getRank() {
		return rank;
	}

	public int getNumOfVoters() {
		return numOfVoters;
	}

	//
	// Setters
	//
	public void setName(String name) {
		this.name = name;
	}

	public void setActors(Set<String> actors) {
		this.actors = actors;
	}
	
	//
	// Functions
	//
	
	@Override
	public String toString() {
		return "Movie: " + name + ". Actors: " + actors + ". Voters: " + numOfVoters + ". Rank: " + rank;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Movie)) {
			return false;
		}
		Movie other = (Movie) obj;
		if (actors == null) {
			if (other.actors != null) {
				return false;
			}
		} else if (!actors.equals(other.actors)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	public void addActor(String actor){
		// Adds one actor to acrotrs set
		actors.add(actor);
	}
	
	public void updateRank(int rank){
		//Updates the rank
		if (rank < 0 || rank > 10) {
			throw new IllegalArgumentException("Illegal rank: " + rank);
		} else {
			this.rank = rank;
		}		
	}
		
}
