package com.example.demo;

abstract class Animal {

	protected boolean isMammal;
	protected boolean isCarnivorous;

	abstract public String getGreeting();

	public Animal(boolean isMammal, boolean isCarnivorous) {
		this.isMammal = isMammal;
		this.isCarnivorous = isCarnivorous;
	}

	public boolean getIsMammal() {
		return this.isMammal;
	}

	public boolean getIsCarnivorous() {
		return this.isCarnivorous;
	}

	public void printResult(String animal) {
		System.out.println(
				"A " + animal + " says '" + this.getGreeting() + "', is " + (this.getIsCarnivorous() ? "" : "not ")
						+ "carnivorous, and is " + (this.getIsMammal() ? "" : "not ") + "a mammal.");
	}
}

class Dog extends Animal {
	public Dog() {
		super(true, true);
	}

	public String getGreeting() {
		return "ruff";
	}
}

class Cow extends Animal {
	public Cow() {
		super(true, false);
	}

	public String getGreeting() {
		return "moo";
	}
}

class Duck extends Animal {
	public Duck() {
		super(false, false);
	}

	public String getGreeting() {
		return "quack";
	}
}

public class AnimalMain {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.printResult("dog");

		Animal cow = new Cow();
		cow.printResult("cow");

		Animal duck = new Duck();
		duck.printResult("duck");
	}
}