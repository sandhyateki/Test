package com.example.demo;

public class FizzBuzz {

	public static void main(String args[]) {
		fizzBuzz(50);

	}

	public static void fizzBuzz(Integer number) {

		if (number % 15 == 0) {
			System.out.println("FizzBuzz");
		} else if (number % 3 == 0) {
			System.out.println("Fizz");
		} else if (number % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(String.valueOf(number));
		}

	}
}
