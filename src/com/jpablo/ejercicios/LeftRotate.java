package com.jpablo.ejercicios;

public class LeftRotate {

	public static void leftRotate(int[] a, int n){
        int temp = 0;
        for(int i=0;i<n;i++){
            temp = a[0];
            for(int j=0;j<a.length-1;j++){
                a[j]=a[j+1];
            }
            a[a.length-1] = temp;
        }

        for(int k=0;k<a.length;k++) System.out.print(a[k] + " ");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {1,2,3,4,5};
		
		leftRotate(arr,4);
	}

}
