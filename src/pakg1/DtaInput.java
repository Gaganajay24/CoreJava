package pakg1;

import java.util.Scanner;
import pakg2.*;
public class DtaInput {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name=sc.next();
		System.out.println("Enter the roll no : ");
		String rollNo=sc.next();
		System.out.println("Enter the college name aspiring for : ");
		String clg=sc.next();
		System.out.println("Enter the score : ");
		int score=sc.nextInt();
		System.out.println("Enter the city");
		String city=sc.next();
		Validation vc=new Validation();
		vc.result(rollNo, name, score, city);
		
	}
}
