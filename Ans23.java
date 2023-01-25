package com.simple;

import java.util.Scanner;

public class Ans23 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int a=sc.nextInt();
		int rem,temp,temp1,rev=0;
		while(a>0) {
			rem=a%10;
			temp=a/10;
			a=temp;
			rev=(rev*10)+rem;
		}
		System.out.println("Reverse of entered numbers is : "+rev);
	}
	
}
