package com.jpablo.ejercicios;

public class ArbolBinario {
	
	public static void main(String[] arg) {
		Nodo raiz = new Nodo(1);
		Nodo nodo2 = new Nodo(2);
		Nodo nodo3 = new Nodo(3);
		Nodo inv = null;
		
		nodo3.setDer(new Nodo(6));
		nodo3.setIzq(new Nodo(5));
		
		nodo2.setIzq(new Nodo(4));
		
		raiz.setIzq(nodo2);
		raiz.setDer(nodo3);
		
		System.out.println("Pre Orden");
		preOrden(raiz);
		System.out.println("\nIn Orden");
		inOrden(raiz);
		System.out.println("\nPost Orden");
		postOrden(raiz);
		
		inv = inverse(raiz);
		System.out.println("\n\nPre Orden");
		preOrden(inv);
		System.out.println("\nIn Orden");
		inOrden(inv);
		System.out.println("\nPost Orden");
		postOrden(inv);
	} 

	public static void preOrden(Nodo raiz) {
		if(raiz != null) {
			System.out.print(raiz.getDato() + "-");
			preOrden(raiz.getIzq());
			preOrden(raiz.getDer());
		}
	}
	
	public static void inOrden(Nodo raiz) {
		if(raiz !=null) {
			inOrden(raiz.getIzq());
			System.out.print(raiz.getDato() + "-");
			inOrden(raiz.getDer());
		}
	}
	
	public static void postOrden(Nodo raiz) {
		if(raiz != null) {
			postOrden(raiz.getIzq());
			postOrden(raiz.getDer());
			System.out.print(raiz.getDato() + "-");
		}
	}
	
	public static Nodo inverse(Nodo raiz) {
		if(raiz != null) {
			Nodo der = inverse(raiz.getDer());
			Nodo izq = inverse(raiz.getIzq());
			raiz.setDer(izq);
			raiz.setIzq(der);
		}
		return raiz;
	}
}
