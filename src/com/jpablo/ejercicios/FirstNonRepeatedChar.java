package com.jpablo.ejercicios;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
	public static char firstNonRepeatedChar(String value){
		HashMap<Character, Integer> scoreboard = new HashMap<>();
		for(int i=0;i<value.length();i++) {
			char c = value.charAt(i);
			if(scoreboard.containsKey(c)) {
				scoreboard.put(c, scoreboard.get(c) + 1);
			}
			else {
				scoreboard.put(c, 1);
			}
		}
		for(int i=0;i<value.length();i++) {
			char c=value.charAt(i);
			if(scoreboard.get(c) == 1) return c;
		}
		throw new RuntimeException("Undefined Behavior");
	}
	
	public static void main(String[] arg) {
		firstNonRepeatedChar("Juan Pablo");
	}
}
