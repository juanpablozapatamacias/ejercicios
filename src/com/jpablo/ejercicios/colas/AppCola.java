package com.jpablo.ejercicios.colas;

public class AppCola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola<Integer> colita = new Cola<>();
		
		colita.insertar(4);
		colita.insertar(7);
		colita.insertar(1);
		
		System.out.println("Elementos iniciales en la cola: " + colita.tamCola());
		System.out.println("El elemento atendido es: " + colita.quitar());
		System.out.println("Elementos iniciales en la cola: " + colita.tamCola());
		//System.out.println(colita.toString());
		System.out.println("Validando si la cola esta vacia: " + colita.isEmpty() != null ? "No esta Vacia" : "Esta Vacia");
		// System.out.println("El elemento atendido es: " + colita.quitar());
		// System.out.println("El elemento atendido es: " + colita.quitar());
		
		System.out.println("El elemento inicial de la cola es: " + colita.inicioCola());
		
		colita.insertar(2);
		System.out.println("El elemento inicial de la cola es: " + colita.inicioCola());
	}

}
