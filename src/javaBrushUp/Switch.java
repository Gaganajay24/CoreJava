package javaBrushUp;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch obj=new Switch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1 ");
		int a=sc.nextInt();
		System.out.println("Enter the number 2");
		int b=sc.nextInt();
		System.out.println("Enter choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1 :System.out.println("addition");
				obj.add(a,b);
				break;
		case 2 : System.out.println("Subtraction");
				obj.sub(a,b);
				break;
		case 3 :System.out.println("Multiplication");
				obj.mul(a,b);
				break;
		case 4  : System.out.println("Division");
		          obj.div(a,b);
		          break;
		default : System.out.println("select languge 1 0r 2 or 3");
					break;
		
		}
		
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	public void mul(int a,int b) {
		System.out.println(a*b);
	}
	public void div(int a,int b) {
		try {
			float res=a/b;
			System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.out.println("can't divide by zero");
		}
		
	}

}
