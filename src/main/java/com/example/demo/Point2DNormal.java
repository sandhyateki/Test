package com.example.demo;

public class Point2DNormal {

	public static int squareRoot(double x1, double x2, double y1, double y2) {

		double sq = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		return (int) Math.ceil(sq);
	}

	public static int squareRoot(double x1, double x2, double y1, double y2, double z1, double z2) {

		double sq = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));
		return (int) Math.ceil(sq);
	}
	
	public static void main(String args[]) {
		
		System.out.println(squareRoot(2,5,5,9));
		System.out.println(squareRoot(1,2,3,4,5,6));
	}
}
		