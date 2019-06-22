package com.jpablo.ejercicios.listasenlazadas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista<Integer> nuevaLista = new Lista<>();
		Nodo res = null;
		Nodo res2 = null;
		
		nuevaLista.insertar("3");
		nuevaLista.insertar("4");
		nuevaLista.insertar("5");
		nuevaLista.insertar("8");
		nuevaLista.insertar("9");
		nuevaLista.mostrar();
		
		System.out.println();
		
		//nuevaLista.insertarFinal("5");
		//nuevaLista.mostrar();
		
		res = nuevaLista.reverse(nuevaLista.primerElemento, null);
		System.out.println();
		nuevaLista.contar(nuevaLista.primerElemento);
		
		System.out.println();
		nuevaLista.mostrar();
		System.out.println("");
		nuevaLista.contar(res);
		
		System.out.println();
		nuevaLista.buscar("9", res);
		nuevaLista.buscar("7", res);
		
		
		
		System.out.println();
		
		Lista<String> nuevaLista2= new Lista<>();
		nuevaLista2.insertar("Pepe");
		nuevaLista2.insertar("Pablo");
		nuevaLista2.insertar("Pedro");
		System.out.println("");
		nuevaLista.mostrar2(nuevaLista2.primerElemento);
		
		System.out.println();
		nuevaLista2.contar(nuevaLista2.primerElemento);
		
		res2 = nuevaLista2.reverse2(nuevaLista2.primerElemento);
		System.out.println();
		nuevaLista2.mostrar2(res2);
		System.out.println();
		nuevaLista2.contar(res2);
		System.out.println();
		nuevaLista2.buscar("Pablo", res2);
		nuevaLista2.buscar("Paco", res2);
		
		System.out.println();
		palindrome();
	}
	
	public static void palindrome() {
		Lista<Integer> nuevaLista3 = new Lista<>();
		Nodo res = null;
		
		nuevaLista3.insertarFinal(3);
		nuevaLista3.insertarFinal(3);
		nuevaLista3.insertarFinal(4);
		nuevaLista3.insertarFinal(4);
		nuevaLista3.insertarFinal(3);
		nuevaLista3.insertarFinal(6);
		
		nuevaLista3.mostrar();
		
		res = nuevaLista3.primerElemento;
		
		System.out.println(nuevaLista3.isPalindrome(res) ? " - Es palindromo!!" : " - No es palindromo!!");
	}
}
