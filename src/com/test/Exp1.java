package com.test;

public class Exp1 {

	int id=101;
	static int pin=1919178;
	public void display() {
		System.out.println(id+" "+Exp1.pin);
	}
	
	//factory method for creating object
	public Exp1 getObj(/*Exp1 obj*/) {
		//return new Exp1();
		Exp1 obj =new Exp1();
		return obj;
		
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Exp1 exp1=new Exp1();
		exp1.display();
		
		Exp1 obj1=new Exp1();
		Exp1 obj2=obj1.getObj();
		
		Exp1 obj3=(Exp1)obj1.clone();
		//for printing hashcode
		System.out.println(exp1.hashCode());
	}
}

