package com.constructors;


class Employee{
	public Employee() {
		System.out.println("default");
	}
	public Employee(int x,String y) {
		System.out.println("parametarised");
	}
	
	//constructor overloading
	public Employee(double x,char y) {
		System.out.println("overloaded");
	}
	//object parameterised
	public Employee(Employee obj) {
		System.out.println("object parameterised");
	}
}
public class constructorsEg {
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		Employee emp1=new Employee(1,"gagana");
		Employee emp2=new Employee(1.23,'a');
		Employee emp3=new Employee(emp);
	}

	
}
