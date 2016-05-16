package com.netanel.imdb;

import java.util.*;

public class ImdbUI {
	public static void runUI(IMDB imdb) {
		// Main UI function
		boolean done = false;
		String[] tokens;
		String name;
		String availableCommands = "Available commands: add, vote, get all, top, done.";
		System.out.println("Welcome to the IMDB User Interface.\n" + availableCommands);
		while (!done) {
			tokens = getLine();
			switch (tokens[0]) {
			case "add":
				// "add" method
				if (tokens.length == 1) {
					System.out.println("Add a movie to the DB.");
					System.out.println("USAGE: add;Movie Name;Actor 1;Actor 2...");
					break;
				}
				name = tokens[1];
				Set<String> actors = new HashSet<>();
				for (int j = 2; j < tokens.length; j++) {
					actors.add(tokens[j]);
				}
				try {
					imdb.addMovie(name, actors);
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
					break;
				}
				System.out.println(name + " successfully added to the DB.");
				break;
			case "vote":
				// "vote" method
				if (tokens.length == 1) {
					System.out.println("Rank a movie in the DB.");
					System.out.println("USAGE: vote;Movie Name;vote (0-10)");
					break;
				}
				name = tokens[1];
				int vote = Integer.parseInt(tokens[2]);
				try {
					imdb.vote(name, vote);
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
					break;
				}
				System.out.println("Vote accepted");
				break;
			case "get all":
				// "get all" method
				System.out.println(imdb.getAll());
				break;
			case "top":
				// "top" method"
				int top, defaultTop = 8;
				// Check if the user entered a top number
				if (tokens.length >= 2) {
					top = Integer.parseInt(tokens[1]);
				} else {
					if (imdb.getMovies().size() > defaultTop) {
						top = defaultTop;
					} else {
						defaultTop = top = imdb.getMovies().size();
					}
				}
				try {
					System.out.println("Showing top " + top + " movies:\n" + imdb.getTop(top));
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
					System.out.println("Showing top " + defaultTop + " movies:\n" + imdb.getTop(defaultTop));
					break;
				}
				break;
			case "done":
				// End the loop
				done = true;
				System.out.println("Bye bye...");
				break;
			default:
				System.out.println(availableCommands);
				
			}
		}
	}

	public static String[] getLine() {
		// Splits a semi-colon delimited line to a String array
		Scanner sc = new Scanner(System.in);
		String[] tokens = sc.nextLine().split(";");
		// sc.close();
		return tokens;
	}

}
