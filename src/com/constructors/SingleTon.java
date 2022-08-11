package com.constructors;

//singleton only creates one object
class SingleTn{
	static SingleTn obj=null;
	
	private SingleTn() {
		
	}
	public static SingleTn getObj() {
		if(obj==null) {
			obj=new SingleTn();
		}
		return obj;
	}
}
public class SingleTon {

	public static void main(String[] args) {
		SingleTn sg=SingleTn.getObj();
	}
}
