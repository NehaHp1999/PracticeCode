package com.simple;

import java.util.Scanner;

public class Ans9 {
	public static void main(String args[]) {
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first input number: ");
		int a=sc.nextInt();
		System.out.println("Enter second input number: ");
		int b=sc.nextInt();
		System.out.println("Enter third input number: ");
		int c=sc.nextInt();
		avg=(a+b+c)/2;
		System.out.println("Average is: " +avg);
	}
}
