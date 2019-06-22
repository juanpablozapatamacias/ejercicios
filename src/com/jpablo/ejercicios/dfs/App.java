package com.jpablo.ejercicios.dfs;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String arg[]) {
		
		Vertex v1 = new Vertex("a");
		Vertex v2 = new Vertex("b");
		Vertex v3 = new Vertex("c");
		Vertex v4 = new Vertex("d");
		Vertex v5 = new Vertex("e");
		Vertex v6 = new Vertex("f");
		Vertex v7 = new Vertex("g");
		Vertex v8 = new Vertex("h");
		Vertex v9 = new Vertex("i");
		Vertex v10 = new Vertex("j");
		Vertex v11 = new Vertex("k");
		
		List<Vertex> listVertex = new ArrayList<>();
		
		v1.addNeighbor(v2);
		v1.addNeighbor(v3);
		v2.addNeighbor(v4);
		v2.addNeighbor(v5);
		
		v3.addNeighbor(v6);
		v3.addNeighbor(v7);
		
		v4.addNeighbor(v8);
		
		v5.addNeighbor(v9);
		v5.addNeighbor(v10);
		
		v7.addNeighbor(v11);
		
		listVertex.add(v1);
		listVertex.add(v2);
		listVertex.add(v3);
		listVertex.add(v4);
		listVertex.add(v5);
		listVertex.add(v6);
		listVertex.add(v7);
		listVertex.add(v8);
		listVertex.add(v9);
		listVertex.add(v10);
		listVertex.add(v11);
		
		
		DFS dfs = new DFS();
		
		dfs.dfs(listVertex);
		
	}
}
