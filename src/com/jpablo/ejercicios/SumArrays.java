package com.jpablo.ejercicios;

public class SumArrays {

	static int simpleArSum(int[] ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++)
			sum = sum + ar[i];
		
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,2,3,4,10,11};
		simpleArSum(nums);
	}

}
