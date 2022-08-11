
public class GlbLcl {
 int a=10;
 int b=20;
 public void userMethod() {
		int x=40;
		int y=50;
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		GlbLcl gl=new GlbLcl();
		gl.userMethod();
	}
	
}
