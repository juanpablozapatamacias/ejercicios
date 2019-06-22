package com.jpablo.ejercicios.generics;

public class ArrayPractice{

	
	
	public static void main(String[] a) {
		Printer<Integer> integer = new Printer<Integer>();
		Printer<String> estring = new Printer<String>();
		Printer<Boolean> booleano = new Printer<Boolean>();
		Integer[] arr= {1,2,3,4,5};
		String[] arr2= {"Juan","Pepe","Peter"};
		Boolean[] arr3 = {true, false, true};
		integer.printArray(arr);
		estring.printArray(arr2);
		booleano.printArray(arr3);
	}
	
	
}

class Printer<A>{
	public static <A> void printArray(A[] arr) {
		System.out.print("[ ");
		
		for(A elem : arr) {
			System.out.print(elem + " ");
		}
		
		System.out.print("]");
	}
}
