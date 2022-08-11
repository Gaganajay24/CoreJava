package javaBrushUp;

import java.util.Scanner;

public class exp15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the pgm language");
		String pgm_lan=sc.next();
		System.out.println("Enter ur age");
		int age=sc.nextInt();
		System.out.println("Enter city");
		String city=sc.next();
		System.out.println("Enter phone number");
		Long phno=sc.nextLong();
		System.out.println("name : "+name);
		System.out.println("pgm language : "+pgm_lan);
		System.out.println("age : "+age);
		System.out.println("city : "+city);
		System.out.println("PhNo : "+phno);
	}

}
