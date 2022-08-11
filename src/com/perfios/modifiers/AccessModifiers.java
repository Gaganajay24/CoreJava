package com.perfios.modifiers;

import com.perfios.external.*;
public class AccessModifiers {

	public static int a=10;
	private static int b=20;
	protected static int c=30;
	static int d=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
class exp2 extends Extra{
		public void display() {
			AccessModifiers acmod =new AccessModifiers();
			System.out.println(acmod.a);
			System.out.println(acmod.c);
			
			
		}
}
