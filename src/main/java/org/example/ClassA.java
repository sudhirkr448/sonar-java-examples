package org.example;

public class ClassA {

	public void execute() {
		int x = 10000;
		x *= 2;
		x %= 100;
	}
	
	public void doExecute() {
		int x = 10000;
		x *= 2;
		x %= 100;
	}
	
	public void duplicatedStringLiterals() {
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		
		System.out.println("Hi!");
		System.out.println("Hi!");
		
		System.out.println("Hello Sonar!");
		System.out.println("Hello Sonar!");
	}
}
