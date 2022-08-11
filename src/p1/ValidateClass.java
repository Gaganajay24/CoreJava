package p1;

class Data{
	
//	private int id=80;
	public int usn=100;
	public int rollno;
	public String name="svg";
//	public String clg="BNMIT";
	public int score;
	//public String city="Blore";
	
}




public class ValidateClass extends Data{

	public void stdDetails() {
		if (score>=90) {
			System.out.println("Excellent");
		}
		else if(score>=80 ) {
			System.out.println("very good");
		}
		else if(score>=70) {
			System.out.println("good");
		}
		else {
			System.out.println("average");
		}
	}
	
	public void display(String name,int usn) {
		System.out.println(name+" "+usn);
	}
	
}




