class expA{
public void draw() {
	System.out.println("This is class A");
}
}
class expB extends expA{
	public void draw() {
		System.out.println("This is class B");
	}
}
public class exp14 {

	
	public static void main(String[] args) {
		
		expB ref =new expB();
		ref.draw();
	}
}

