package com.jpablo.amazon.eval;
//IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//DEFINE ANY CLASS AND METHOD NEEDED
//CLASS BEGINS, THIS CLASS IS REQUIRED
class GCD
{
 // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
 public int generalizedGCD(int num, int[] arr)
 {
     // WRITE YOUR CODE HERE
     int result = arr[0];
     for (int i=0;i<num;i++){
         result=gcd(arr[i],result);
     }
     return result;
 }
 
 public int gcd(int num1, int num2){
     if(num1 == 0) 
    	 return num2;
     return gcd((num2 % num1), num1);
 }
 // METHOD SIGNATURE ENDS
}
