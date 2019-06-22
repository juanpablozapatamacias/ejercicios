package com.jpablo.ejercicios;

import java.util.concurrent.TimeoutException;

public class ExceptionEx {

	public static void Foo() {
		/*try {
			throw new Exception();
		}
		catch(TimeoutException me) {
			System.out.println("In My Exception");
		}
		catch(Exception e) {
			System.out.println("In Exception");
		}*/
		throw new RuntimeException();
	}
	
	public static void main(String[] ar) {
		Foo();
		
		String name="David";
		Object x = name;
		
		Object y ="David";
		String nm= (String)y;
	}
}
