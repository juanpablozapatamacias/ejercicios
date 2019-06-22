package com.jpablo.ejercicios;

import java.util.Arrays;

public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] nums) {
		boolean band = false;
		int num = 0;
		if( nums==null || nums.length == 0 ) band = false;
		
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i] == nums[i+1]) num++;
		}
		
		int[] arNeg = new int[num];
		arNeg[0] = nums[0];
		int n=1;
		
		for(int j=1;j<nums.length-1;j++) {
			if(nums[j] == nums[j+1]) arNeg[n++]=nums[j];
		}
		
		if(arNeg.length >=0) band = true;
		
		System.out.println("Se encontraron " + arNeg.length + " numeros duplicado(s)");
		
		return band;
	}
	
	public static void main(String[] argv) {
		int [] param =  new int[] {1,2,3,4,1,2,4};
		containsDuplicate(param);
	} 
	
}
