package pakg2;


public class Validation {

	public  String clg;
	
	public  void result(String rollNo, String name, int score, String city) {
		// TODO Auto-generated method stub
		if(score>=90) {
			clg="IIT";
		}
		else if(score>=80&&score<=90) {
			clg="BITS";
					
		}
		else if(score>=70&&score<=60) {
			clg="IIIT";
		}
		else {
			clg="Regional Engineering clg";
		}
		System.out.println("=====Result======");
		System.out.println("Name : "+name);
		System.out.println("Roll No : "+rollNo);
		System.out.println("Score : "+score);
		System.out.println("City : "+city);
		System.out.println("College : "+clg);
	}
	
	
}
