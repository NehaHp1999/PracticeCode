package com.simple;

import java.util.ArrayList;

public class Ans24 {
public static void main(String args[]) {
	int i,j,k;
	ArrayList<Integer> arr1=new ArrayList<Integer>();
	ArrayList<Integer> arr2=new ArrayList<Integer>();
	ArrayList<Integer> arr3=new ArrayList<Integer>();
	for(i=1;i<=100;i++) {
		if(i%3==0) {
			arr1.add(i);
		}
	}
	System.out.println("Divided by 3: " +arr1);
	
	for(j=1;j<100;j++) {
		if(j%5==0) {
			arr2.add(j);
		}
	}
	System.out.println("Divided by 5: " +arr2);
	
	for(k=1;k<=100;k++) {
		if(k%5==0&&k%3==0) {
			arr3.add(k);
		}
	}
	System.out.println("Divided by 3 and 5: " +arr3);
	
}
}
