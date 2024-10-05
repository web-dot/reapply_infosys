package com.reaplly.progrmming;

interface Interface {
	//1. cannot be instantiated
	
	//2. can have static methods with body
	public static void count() {

	}
	//3. can have instance methods, which are implicitly public and abstract
	int run();
	
	//4. cannot have instance methods with body as they are implicitly abstract
//	public void play() {
//
//	}
	
	//5. can have default methods
	default void work() {
		
	}
	
}

abstract class Abs {
	//1. cannot be instantiated
	
	//2. can have static methods
	public static void count() {

	}
	
	//3. can have abstract methods
	public abstract int run();
	
	//4. can have instance methods
	public void play() {

	}
	
	//5. can not have default methods
//	default void work() {
//		
//	}
}

public abstract class AbsAndIns {

}
