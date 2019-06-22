package com.jpablo.ejercicios;

public class ArbolBinarioA {

	Nodo raiz;
	public ArbolBinarioA() {
		raiz = null;
	}
	
	// Add node to the tree
	public void agregarNodo(String nom, int d) {
		Nodo nuevo = new Nodo(nom,d);
		Nodo auxiliar = null;
		Nodo padre;
		if(raiz ==null) {
			raiz = nuevo;
		}
		else {
			auxiliar = raiz;
			while(true) {
				padre = auxiliar;
				if(d < auxiliar.getDato()) {
					auxiliar = auxiliar.getIzq();
					if(auxiliar==null) {
						padre.setIzq(nuevo);
						return;
					}
				}
				else {
					auxiliar = auxiliar.getDer();
					if(auxiliar == null) {
						padre.setDer(nuevo);
						return;
					}
				}
			}
		}
	}
	
	// Metodo para saber cuando un arbol es vacio
	public boolean estaVacio() {
		return raiz == null;
	}
	
	// Metodo para recorrer un arbol InOrden
	public void inOrden(Nodo r) {
		if(r != null) {
			inOrden(r.getIzq());
			System.out.print(r.getDato() + "->" + r.getNombre() + ", ");
			inOrden(r.getDer());
		}
	}
	
	// Metodo para recorrer un arbol PreOrden
	public void preOrden(Nodo r) {
		if(r!=null) {
			System.out.print(r.getDato() + "->" + r.getNombre()+ ", ");
			preOrden(r.getIzq());
			preOrden(r.getDer());
			
		}
	}
	
	// Meotod para recorrer un arbol PostOrden
	public void postOrden(Nodo r) {
		if(r!=null) {
			postOrden(r.getIzq());
			postOrden(r.getDer());
			System.out.print(r.getDato() + "->" + r.getNombre() + ", ");
		}
	}
	
	//Metodo para realizar arbol binario de busqieda
	public Nodo buscaNodo(int dato) {
		Nodo aux = raiz;
		while(aux.getDato() != dato) {
			if(dato < aux.getDato()) {
				aux= aux.getIzq();
			}
			else {
				aux = aux.getDer();
			}
			if(aux == null) 
				return null;
		}
		return aux;
	}
	
	// Metodo para eliminar un nodo
	public boolean eliminaNodo(int dato) {
		Nodo aux = raiz;
		Nodo padre =  raiz;
		boolean esIzq =true;
		
		while (aux.getDato() != dato) {
			padre = aux;
			if(dato < aux.getDato()) {
				esIzq = true;
				aux = aux.getIzq();
			}
			else {
				esIzq = false;
				aux = aux.getDer();
			}
			if(aux == null) {
				return false;
			}
		}// fin de while
		
		if(aux.getIzq()== null && aux.getDer()==null) {
			if(aux == raiz) 
				raiz = null;
			else if(esIzq) 
				padre.setIzq(null);
			else 
				padre.setDer(null);
		}
		else if(aux.getDer()==null) {
			if(aux == raiz) 
				raiz = aux.getIzq();
			else if(esIzq) 
				padre.setIzq(aux.getIzq());
			else 
				padre.setDer(aux.getIzq());
		}
		else if(aux.getIzq()==null) {
			if(aux == raiz) 
				raiz = aux.getDer();
			else if(esIzq) 
				padre.setIzq(aux.getDer());
			else 
				padre.setDer(aux.getIzq());
		}
		else {
			Nodo reemplazo = obtenerNodoReemplazo(aux);
			if(aux == raiz) {
				raiz = reemplazo;
			}
			else if(esIzq) { 
				padre.setIzq(reemplazo);
			}
			else { 
				padre.setDer(reemplazo);
			}			
			reemplazo.setIzq(aux.getIzq());
		}
		return true;
	}

	public Nodo obtenerNodoReemplazo(Nodo nodoRem) {
		// TODO Auto-generated method stub
		Nodo reemplazaPadre = nodoRem;
		Nodo reemplazo = nodoRem;
		Nodo aux = nodoRem.getDer();
		
		while(aux != null) {
			reemplazaPadre = reemplazo;
			reemplazo=aux;
			aux = aux.getIzq();
		}
		
		if(reemplazo!= nodoRem.getDer()) {
			reemplazaPadre.setIzq(reemplazo.getDer());
			reemplazo.setDer(nodoRem.getDer());
		}
		System.out.println("\nNodo reemplazo es " + reemplazo);
		return reemplazo;
	}
	
	public Nodo inverso(Nodo nodoInv) {
		if(nodoInv != null) {
			Nodo izq = inverso(nodoInv.getIzq());
			Nodo der = inverso(nodoInv.getDer());
			nodoInv.setIzq(der);
			nodoInv.setDer(izq);
			
		}
		return nodoInv;
	}
}
