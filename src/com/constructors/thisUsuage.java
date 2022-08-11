package com.constructors;


class Book{
	
	//Book bk=new Book("gagana");  this declaration can cause stack overflow
	public Book() {
		this("java");//calling one constructor from another
		//Book bk=new Book("gagana");
		System.out.println("default");
	}
	
	public Book(String name) {
		this(22);
		System.out.println(name);
	}
	
	public Book(int x) {
		System.out.println(x);
	}
}
public class thisUsuage {
	
	public static void main(String[] args) {
		Book bk=new Book();
	}

	
}
