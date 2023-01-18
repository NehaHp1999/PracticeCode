package com.simple;

import java.util.Scanner;

public class Ans15 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number: ");
	int a=sc.nextInt();
	int res=1;
	while(a!=0) {
		res=res*a;
		--a;
	}
	System.out.println("Result is: " +res);
}
}
