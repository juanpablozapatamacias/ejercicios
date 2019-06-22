package com.jpablo.ejercicios;

public class Nodo {

	private int dato;
	private Nodo izq;
	private Nodo der;
	private String nombre;
	
	public Nodo(String nombre, int dato) {
		this.nombre = nombre;
		this.dato = dato;
		this.izq = null;
		this.der = null;
	}
	
	public Nodo(int dato) {
		this.dato = dato;
		this.der=null;
		this.izq=null;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Nodo getIzq() {
		return izq;
	}

	public void setIzq(Nodo nodo) {
		izq = nodo;
	}

	public Nodo getDer() {
		return der;
	}

	public void setDer(Nodo nodo) {
		der = nodo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return nombre + " y su dato es " + dato;
	} 
}
