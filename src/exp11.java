//pyramid
public class exp11 {

	static int star=1;
	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			for(int j=0;j<10-i;j++) {
				System.out.print(" ");
				
			}
			for(int k=0;k<star;k++)
				System.out.print("*");
			
			System.out.println();
			star=star+2;
		}

	}
	
}
