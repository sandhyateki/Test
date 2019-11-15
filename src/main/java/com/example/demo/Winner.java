package com.example.demo;

public class Winner {

	public static void main(String args[]) {

		System.out.println(winner("MMM", "EMH"));

	}

	public static String winner(String erica, String bob) {

		int ericaPoints = pointCount(erica);
		int bobPoints = pointCount(bob);

		if (ericaPoints > bobPoints)
			return "Erica";
		if (bobPoints > ericaPoints)
			return "Bob";
		return "Tie";
	}

	public static int pointCount(String name) {
		int points = 0;
		for (int i = 0; i < name.length(); i++) {
			points = points + check(name.substring(i, i + 1));
		}
		return points;
	}

	public static int check(String a) {
		switch (a) {
		case "E":
			return 1;
		case "M":
			return 3;
		case "H":
			return 5;
		default:
			return 0;
		}

	}
}
