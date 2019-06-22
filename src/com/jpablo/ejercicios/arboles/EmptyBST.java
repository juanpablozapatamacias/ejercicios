package com.jpablo.ejercicios.arboles;

public class EmptyBST<D extends Comparable> implements Tree<D> {
	public EmptyBST() {}
	
	public boolean isEmpty() {
		return true;
	}
	
	public int cardinality() {
		return 0;
	}
	
	public boolean member(D elem) {
		return false;
	}
	
	public NonEmptyBST<D> add (D elem){
		return new NonEmptyBST<D>(elem);
	}
}
