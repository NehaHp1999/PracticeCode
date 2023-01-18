package com.simple;

import java.util.Scanner;

public class Ans16 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number: ");
	int a=sc.nextInt();
	int res1=0;
	int res2=1;
	System.out.println(res1+"\n"+res2);
	for(int i=0;i<(a-2);i++) {
		int res3=res1+res2;
		System.out.println(res3);
		res1=res2;
		res2=res3;
		
	}	
	}
	
}
