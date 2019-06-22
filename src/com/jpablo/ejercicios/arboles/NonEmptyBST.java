package com.jpablo.ejercicios.arboles;

public class NonEmptyBST<D extends Comparable> implements Tree<D> {
	D data;
	Tree<D> left;
	Tree<D> right;
	
	public NonEmptyBST(D elem) {
		data = elem;
		left = new EmptyBST<D>();
		right = new EmptyBST<D>();
	}
	
	public NonEmptyBST(D elem, Tree<D> leftTree, Tree<D> rightTree) {
		 data = elem;
		 left = leftTree;
		 right = rightTree;
	}

	public boolean isEmpty() {
		return false;
	}

	public int cardinality() {
		return 1 + left.cardinality() + right.cardinality();
	}

	public boolean member(D elem) {
		if(data == elem) return true;
		else {
			if (elem.compareTo(data) < 0) return left.member(elem);
			else return right.member(elem);
		}
	}

	public NonEmptyBST<D> add(D elem) {
		if(data == elem) {
			return this;
		}
		else {
			if(elem.compareTo(data) < 0) {
				return new NonEmptyBST(data,left.add(elem),right);
			}
			else return new NonEmptyBST(data,left,right.add(elem));
		}
	}
}
