package com.jpablo.ejercicios.colas;

public class Cola <D>{
	Nodo inicio, fin;
	int tam;
	
	public Cola() {
		inicio = fin = null;
		tam = 0;
	}
	
	public boolean isEmpty() {
		return inicio == null;
	}
	
	public <D> void insertar (D dato) {
		Nodo nuevo = new Nodo(dato);
		
		if(isEmpty()) {
			inicio = nuevo;
		}else {
			fin.setSiguiente(nuevo);
		}
		
		fin = nuevo;
		tam++;
	}
	
	public D quitar() {
		D aux = (D) inicio.getDato();
		inicio = inicio.getSiguiente();
		tam--;
		return aux;
	}
	
	public D inicioCola(){
		return (D) inicio.getDato();
	}
	
	public int tamCola() {
		return tam;
	}
}
