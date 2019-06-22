package com.jpablo.amazon.eval;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tipCalc=0.0;
        double taxCalc=0.0;
        double totalCost=0.0;

        tipCalc = meal_cost * tip_percent/100;
        taxCalc = meal_cost * tax_percent/100;
        
        System.out.println(tipCalc);
        System.out.println(taxCalc);
        
        totalCost = meal_cost; // + tipCalc + taxCalc;
        totalCost += meal_cost * tip_percent/100;
        totalCost += meal_cost * tax_percent/100;
        
        String res=String.format("%.2f", totalCost);
        List<Integer> list = new ArrayList<Integer>();
        
        System.out.println(res);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
