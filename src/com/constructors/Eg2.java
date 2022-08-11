package com.constructors;

//Hierarchy of execution
class Student{
	public Student() {
		System.out.println("Constructor");
	}
	static {
		System.out.println("static block");
	}
	{
		System.out.println("Instance block");
	}
	
	public Student getObj() {
		return new Student();
	}
}
public class Eg2 {
	
	static {
		System.out.println("static block main");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		Student st=new Student();
		Student st1=new Student();
		st.getObj();
	}

}
