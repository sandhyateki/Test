package com.example.demo;

public class Floor{
	
	public static void main(String args[]) {

		System.out.println(floor(1.6, 1.6));
		
	}
	
	private static int floor(double a, double b) {
		return (int) Math.floor(a+b);
	}

}
