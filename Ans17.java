package com.simple;

import java.util.Scanner;

public class Ans17 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of rows to print pattern: ");
	int n=sc.nextInt();
	int i,j,k;
	for(i=1;i<=n;i++){
		for(j=n;j>i;j--) {
			System.out.print(" ");
		}
			for(k=1;k<=i;k++) {
				System.out.print(" *");
			}
		
		System.out.println();
		
	}
	
}
}
