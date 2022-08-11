
public class exp12 {

	public int method1(int x, int y) {
		System.out.println("type1 method");
		return x;
	}
	public void method2(int x,int y) {
		System.out.println("The method takes argument : "+x+y);
	}
	public int method3() {
		int x=1;
		System.out.println("this is method 3 returns but does not take arguments");
		return x;
	}
	public void method4() {
		System.out.println("this is 4th type does not take in argument and does not return anything");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp12 ref =new exp12();
		int a=ref.method1(4,5);
		System.out.println(a);
		ref.method2(4, 5);
		int b=ref.method3();
		System.out.println(b);
		ref.method4();
		
		
		
		
	}
	

}
