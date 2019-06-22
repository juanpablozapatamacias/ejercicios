package com.jpablo.ejercicios.listasenlazadas;

public class Lista <D> {

	Nodo primerElemento;
	
	public Lista() {
		this.primerElemento=null;
	}
	
	public <D> void insertar(D nuevoElem) {
		Nodo nuevoElemento = new Nodo(nuevoElem);
		
		if(primerElemento == null) {
			nuevoElemento.setSiguiente(null);
			primerElemento = nuevoElemento;
		}
		else {
			nuevoElemento.setSiguiente(primerElemento);
			primerElemento = nuevoElemento;
		}
	}
	
	public <D> void insertarFinal(D nuevoElem) {
		Nodo nuevoElemento = new Nodo(nuevoElem);
		
		if(primerElemento == null) {
			primerElemento = nuevoElemento;
		}
		else {
			Nodo temp = primerElemento;
			Nodo actual_ultimo = temp;
			
			while(temp != null) {
				actual_ultimo = temp;
				temp = temp.getSiguiente();
			}
			Nodo nuevo = new Nodo(nuevoElem);
			actual_ultimo.setSiguiente(nuevoElemento);
		}
	}

	public boolean isPalindrome(Nodo nodo) {
		//boolean result = true;
		
		Nodo mitad = encontrarMitad(nodo);
		Nodo secHead = mitad.getSiguiente();
		mitad.setSiguiente(null);
		
		Nodo revSecHead = reverse2(secHead);
		
		while(nodo != null && revSecHead !=null) {
			if(nodo.getDato() == revSecHead.getDato()) {
				nodo = nodo.getSiguiente();
				revSecHead = revSecHead.getSiguiente();
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public Nodo encontrarMitad(Nodo nodo) {
		Nodo puntLento, puntRapido;
		puntLento = puntRapido = nodo;
		
		while(puntRapido != null) {
			puntRapido = puntRapido.getSiguiente();
			
			if(puntRapido != null && puntRapido.getSiguiente() != null) {
				puntLento = puntLento.getSiguiente();
				puntRapido = puntRapido.getSiguiente();
			}
		}
		return puntLento;
	}
	
	public Nodo reverse(Nodo actual, Nodo ant) {
		if(actual.getSiguiente() == null) {
			primerElemento = actual;
			actual.setSiguiente(ant);
			return primerElemento;
		}
		
		Nodo siguiente1 = actual.getSiguiente();
		actual.setSiguiente(ant);
		
		reverse(siguiente1,actual);
		return primerElemento;
	}
	
	public Nodo reverse2(Nodo node) {
		Nodo ant = null;
		Nodo act = node;
		Nodo sig = null;
		
		while(act != null) {
			sig = act.getSiguiente();
			act.setSiguiente(ant);
			ant = act;
			act = sig;
		}
		
		//node = ant;
		return ant;
	}
	public void mostrar() {
		Nodo auxiliar = primerElemento;
		D numeros = null;
		
		while(auxiliar != null) {
			numeros = (D) auxiliar.getDato();
			auxiliar = auxiliar.getSiguiente();
			System.out.print(numeros + " ");
		}
	}
	
	public void mostrar2(Nodo node) {
		while(node != null) {
			System.out.print(node.getDato() + " ");
			node = node.getSiguiente();
		}
	}
	
	public void contar(Nodo node) {
		int count = 0;
		//node = primerElemento;
		while(node != null) {
			count++;
			node = node.getSiguiente();
		}
		System.out.println("El numero de elementos de la lista son: " + count);
	}
	
	public <D> void buscar(D elem, Nodo node) {
		Nodo aux = node;
		Nodo lug = null;
		boolean band = false;
		
		while(aux != null) {
			if(aux.getDato() == elem) {
				band = true;
				lug = aux;
				break;
			}
			else {
				aux = aux.getSiguiente();
			}
		}
		if(band && lug != null) {
			System.out.println("El elemento " + lug.getDato() + " se encuentra en la lista");
		} 
		else {
			lug = null;
			System.out.println("El elemento " + elem + " no se encuentra en la lista");
		} 
	}
	
	
}
