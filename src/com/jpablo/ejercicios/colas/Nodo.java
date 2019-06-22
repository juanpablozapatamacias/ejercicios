package com.jpablo.ejercicios.colas;

public class Nodo<D> {

	private D dato;
	private Nodo siguiente;
	
	public Nodo(D dato) {
		this.dato = dato;
		this.siguiente = null;
	}

	public D getDato() {
		return dato;
	}

	public void setDato(D dato) {
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	@Override
	public String toString() {
		return "El dato " + this.getDato() + " fue añadido a la cola";
	}
}
