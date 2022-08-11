package com.constructors;

import java.util.Scanner;

class Initialization{
	
	int usn;
	String name;
	String college;
	public Initialization(){
		System.out.println("default");
	}
	public Initialization(int usn) {
		this.usn=usn;
		System.out.println(usn);
	}
	public Initialization(String name,String college) {
		this.name=name;
		this.college=college;
		System.out.println(name+" "+college);
	}
	
}
public class ContructorInitialization {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter usn : ");
		int usn=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter college");
		String college=sc.next();
		Initialization in=new Initialization();
		Initialization in1=new Initialization(usn);
		Initialization in2=new Initialization(name,college);
		
		
	}
	
}
