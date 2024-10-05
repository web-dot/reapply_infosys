package com.reaplly.progrmming;

class A {
    private void show() {
        System.out.println("A's show");
    }
    
    public void display() {
        show();
    }
}

class B extends A {
    public void show() {
        System.out.println("B's show");
    }
}

public class JavaTest {
	
	public static void main(String[] args) {
		B obj = new B();
        obj.display();
	}

}
