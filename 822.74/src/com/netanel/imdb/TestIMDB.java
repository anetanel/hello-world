package com.netanel.imdb;

import java.util.*;

public class TestIMDB {
	public static void main(String[] args) {
		Movie m1 = new Movie("Agmageddon", new HashSet<>());
		m1.addActor("Bruce Willis");
		m1.addActor("Ben Affleck");
//		m1.addActor("Ben Affleck");
		
		System.out.println(m1);
		System.out.println(m1.getActors());
		
		m1.setName("Armageddon (1998)");
		System.out.println(m1);
		
		Set<String> actors = new HashSet<>();
		actors.add("Billy Bob Thornton");
		m1.setActors(actors);
		
		System.out.println(m1);
		System.out.println(m1.getActors());
		
		
		System.out.println("*******************************");
		
		IMDB imdb = new IMDB();
		
		Set<String> killBillActors = new HashSet<>();
		killBillActors.add("Uma Thurman");
		killBillActors.add("Lucy Liu");
		imdb.addMovie("Kill Bill", killBillActors);
		System.out.println(imdb.getAll());
		
//		imdb.addMovie("Kill Bill", new HashSet<>());
		
		Set<String> reservoirDogsActors = new HashSet<String>();
		reservoirDogsActors.add("Harvey Keitel");
		imdb.addMovie("Reservoir Dogs", reservoirDogsActors);
		System.out.println(imdb.getAll());
		
		
		
	}
}
