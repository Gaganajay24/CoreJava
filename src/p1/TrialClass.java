package p1;

import java.util.Scanner;

public class TrialClass {
	
	public static String name;
	public static int usn;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name : ");
		name=sc.next();
		System.out.println("Enter usn");
		usn=sc.nextInt();
		ValidateClass vc =new ValidateClass(); 
		vc.display(name,usn);
	}
}
