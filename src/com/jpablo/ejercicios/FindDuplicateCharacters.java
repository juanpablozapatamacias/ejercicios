package com.jpablo.ejercicios;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		printDuplicatedCharacters("potosino");
		printDuplicatedCharacters("Juan Pablo");
		printDuplicatedCharacters("zapata");
		printDuplicatedCharacters("apestoso");
		
		//printDuplicatedCharacters1("zapata");
		
	} 
	
	public static void printDuplicatedCharacters(String value) {
		char[] characters = value.toCharArray();
		
		//use of hashmap with character and number of times they appear in the string
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(Character ch : characters) {
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		
		//Iterate through HashMap to print all duplicated chars of string
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of duplicated chars in String %s %n",value);
		for(Map.Entry<Character,Integer> entry : entrySet) {
			if(entry.getValue() > 1)
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
		}
	}
	
	public static void printDuplicatedCharacters1(String value) {
		char ch;
		String setString="";
		for(int i=0;i<value.length();i++) {
			ch=value.charAt(i);
			if(!setString.contains(String.valueOf(ch))) {
				int count = countFrom(value,ch,i);
				if(count > 1) {
					System.out.print(ch + " ");
				}
				setString += ch;
			}
		}
		
	}
	
	static int countFrom(String str, char ch, int start) {
	    int count = 0;
	    for (int i = start; i < str.length(); i++) {
	        if (str.charAt(i) == ch) {
	            count++;
	        }
	    }
	    return count;
	}
}
