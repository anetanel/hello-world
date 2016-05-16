package com.netanel.imdb;

import java.util.*;

public class ImdbUI {
	public static void runUI(IMDB imdb) {
		boolean done = false;
		String[] tokens;
		while (!done) {
			tokens = getLine();
			String name;
			switch (tokens[0]) {
			case "add":
				name = tokens[1];
				Set<String> actors = new HashSet<>();
				for (int j = 2; j < tokens.length; j++) {
					actors.add(tokens[j]);
				}
				imdb.addMovie(name, actors);
				break;
			case "vote":
				name = tokens[1];
				int vote = Integer.parseInt(tokens[2]);
				imdb.vote(name, vote);
				break;
			case "done":
				done=true;
				break;
			}
		}
	}

	public static String[] getLine() {
		// Splits a semi-colon delimited line to a String array
		Scanner sc = new Scanner(System.in);
		String[] tokens = sc.nextLine().split(";");
		//sc.close();
		return tokens;
	}

}
