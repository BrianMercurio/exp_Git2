package com.mycompany.expgit2_chapter1;

public class MyClass {
	public String name;
	public String lastName;
	
	public MyClass(String name){
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println("BEGIN");
		staticMethod("Brian");
		System.out.println("END");
		
	}

	public static void staticMethod(String inp){
		System.out.println("Hi input is " + inp);
		System.out.println("Bye");
	}
	public String getName(){
		return name;
		
	}
}
