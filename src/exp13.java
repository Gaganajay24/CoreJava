
public class exp13 {

	public void add(int a,int b) {
		System.out.println("the sum is :"+a+" "+b);
	}
	public void add(double a) {
		System.out.println("the sum is :"+a);
	}
	public void add(double a,int b) {
		System.out.println("the sum is :"+a+" "+b);
	}
	public void add(int a,float b) {
		System.out.println("the sum is :"+a+" "+b);
	}
	public static void main(String[] args) {
		
		exp13 ref =new exp13();
		ref.add(2,3);
		ref.add(3.4);
		ref.add(3.4,2);
		ref.add(3,1.2f);
	}
}
