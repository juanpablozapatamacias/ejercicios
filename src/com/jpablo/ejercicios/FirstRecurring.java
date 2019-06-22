package com.jpablo.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstRecurring {
	private String givenString;
	
	FirstRecurring(String str){
		this.givenString = str;
	}
	
	public char firstNonRec(String str) {
		Set<Character> rep = new HashSet<>();
		List<Character> nonRep = new ArrayList<>();
		char[] arr = str.toCharArray();
		
		//Arrays.sort(arr);
		
		for(Character c : arr) {
			if(rep.contains(c)) continue;
			
			if(nonRep.contains(c)) {
				nonRep.remove((Character) c);
				rep.add(c);
			}
			else {
				nonRep.add(c);
			}
		}
		
		return nonRep.get(0);
		
	}

	public String replaceMethod(String str, String from, String to) 
    {
        for(;;) {
        	int i = str.indexOf(from);
        	if(i == -1) break;
        	
        	str=str.substring(0,i) + to +str.substring(i, from.length());
        }
        return str;
    }
	
	public char firstRec(String str) {
		HashSet<Character> hash = new HashSet<>();
		char[] arr = str.toCharArray();
		
		for(Character c : arr) {
			if(hash.contains(c)) 
				hash.add(c);
			else
				return c;
		}
		//return '\0';
		throw new RuntimeException("No first recurring char is available...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstRecurring fr = new FirstRecurring("KRAKOVIA");
		char c = fr.firstRec(fr.getGivenString());
		char x = fr.firstNonRec(fr.getGivenString());
		String s = fr.replaceMethod(fr.getGivenString(), "AKO", "OKA");
		
		System.out.println("The first character recurring for " 
				+fr.getGivenString()
				+ " is " + c);
		System.out.println();
		System.out.println("The first character non recurring for " 
				+fr.getGivenString()
				+ " is " + x);
		System.out.println();
		System.out.println("The String replaced for " 
				+fr.getGivenString()
				+ " is " + s);
	}

	public String getGivenString() {
		return givenString;
	}

	public void setGivenString(String givenString) {
		this.givenString = givenString;
	}

}
