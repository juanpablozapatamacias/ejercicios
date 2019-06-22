package com.jpablo.ejercicios.queues;

import java.util.*;

public class Stacks {

	Stack<Integer> stacky;
	
	public Stacks() {
		this.stacky = new Stack<>();
	}
	
	public void push(Integer n) {
		stacky.push(n);
	}
	
	public Integer pop() {
		Iterator<Integer> it = stacky.iterator();
		Integer num = it.next();
		if(num != null) {
			it.remove();
			return num;
		}
		return 0;
	}
	
	public Integer peek() {
		return stacky.get(0);
	}
	
	public static void main(String[] arg) {
		Stacks st = new Stacks();
		st.push(3);
		st.push(6);
		st.push(9);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}
