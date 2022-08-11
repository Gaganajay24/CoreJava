import java.util.Scanner;

public class exp8 {

	public static void main(String[] args) {
		 int c=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int a=sc.nextInt();
		System.out.println("Enter number 2 : ");
		int b=sc.nextInt();
		if(a>b) {
			if(b>0) {
				System.out.println((a-b));
			}
			else {
				System.out.println("The answer is same as a");
			}
		}
		else {
			if(b!=0 && a!=0) {
				System.out.println("The product is : "+a*b);
			}
			else {
				System.out.println("The sum is  : "+a+b);
			}
		}
		abc(c);
		exp8 newm=new exp8();
		newm.abc2();
		
	}
	public static void abc(int b) {
		System.out.println("This is abc");
		int a=8;
		System.out.println(a+" "+b +" is "+(a+b));
		
	}
	public void abc2() {
		System.out.println("this is abc2");
		abc(2);
	}
	
}
