package com.constructors;


class Product
{
//	Product(){
//		
//	}
static Product obj=null;
	
	private Product() {
		
	}
	public static Product getObj() {
		if(obj==null) {
			obj=new Product();
		}
		return obj;
	}
	
}
public class Eg3 {

	static final public void main(String args[]) {
		
		
		Product pr=Product.getObj();
		
		
	}
}
