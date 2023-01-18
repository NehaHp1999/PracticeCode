package com.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ans19 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first Number: ");
	int a=sc.nextInt();
	System.out.println("Enter second Number: ");
	int b=sc.nextInt();
	int res,temp,gcm=1;
	List<Integer> arr = new ArrayList<>();
	List<Integer> arr1 = new ArrayList<>();
	for(int i=2;i<=9;i++) {
		while(a%i==0) {
			res=a/i;
			arr.add(i);
			a=res;
		}
		}
	
	for(int j=2;j<=9;j++) {
		while(b%j==0) {
			res=b/j;
			arr1.add(j);
			b=res;
		}
	}

List<Integer> common=arr.stream().filter(arr1::contains).distinct().collect(Collectors.toList());
	
	  for(int k=0;k<common.size();k++) { 
		  gcm=gcm*common.get(k); 
		  }
	  System.out.println("GCD is : "+gcm);
	}
		}
	

	
