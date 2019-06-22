package com.jpablo.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Triplets {

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
		
		List<Integer> res = new ArrayList<Integer>();
		int suma=0,sumb=0;
		
		if(a.size()!=b.size()) return null;
		
		for (int i=0;i < a.size(); i++) {
			if(a.get(i)>b.get(i)) 
				suma+=1;
			else if (a.get(i) < b.get(i))
				sumb+=1;
		}
			
		res.add(suma);
		res.add(sumb);
		
		System.out.println(res);
		
		return res;
	}
	
	public static void main(String[] arg) {
		List<Integer> numAlice = new ArrayList<Integer>();
		List<Integer> numBob = new ArrayList<Integer>();
		
		numAlice.add(5);
		numAlice.add(6);
		numAlice.add(7);
		
		numBob.add(3);
		numBob.add(6);
		numBob.add(10);
		
		compareTriplets(numAlice, numBob);
	}
}
