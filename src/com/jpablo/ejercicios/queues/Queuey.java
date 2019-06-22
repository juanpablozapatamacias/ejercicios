package com.jpablo.ejercicios.queues;

import java.util.LinkedList;

public class Queuey {
	
	LinkedList queue;
	
	public Queuey() {
		queue = new LinkedList();
	}
	//queue empty?
	public boolean isEmpty() {
		boolean result = queue.isEmpty();
		return result;
	}
	
	//queue size
	public  int size() {
		return queue.size();
	}
	
	//Enqueuing an item
	public void enqueue(int n) {
		queue.addLast(n);
	}
	
	//Dequeuing a item
	public int dequeue() {
		return (int)queue.remove(0);
	}
	
	//Peek at the first item
	public int peek() {
		return (int)queue.get(0);
	}
	
	public static void main(String arg[]) {
		Queuey numQueue =  new Queuey();
		
		numQueue.enqueue(5);
		numQueue.enqueue(7);
		numQueue.enqueue(9);
		
		System.out.println("Peek at 1st item " + numQueue.peek());
		System.out.println("First out " + numQueue.dequeue());
		System.out.println("Peek at 2nd item " + numQueue.peek());
		System.out.println("Second out " + numQueue.dequeue());
		System.out.println("Third out " + numQueue.dequeue());
	}
	
}
