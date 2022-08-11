class Exp3 {

	public void method1() {
		System.out.println("method1");

	method2();
	}
	
	public void method2() {
		System.out.println("method2");
	}
}

public class MethodChn{
	public static void main(String[] args) {
		Exp3 exp1=new Exp3();
		exp1.method1();
	}
}

