package com.jpablo.ejercicios;

public class SwapTwoIntsNoTemp {

	public static void swap(int a, int b) {
		System.out.println("Antes del SWAP la variable a = " + a + " y la b = " + b + " ");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Despues del SWAP la variable a = " + a + " y la b = " + b + " ");
	}
	
	public static void main(String[] args) {
		swap(10,20);
	}
}
