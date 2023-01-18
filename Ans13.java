package com.simple;

import java.util.Scanner;

public class Ans13 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first integer :");
		int a=sc.nextInt();
		System.out.println("Enter second integer :");
		int b=sc.nextInt();
		if(a!=b) {
			System.out.println(a+"!="+b);
		}
		if(a<b) {
			System.out.println(a+"<"+b);
		}
		if(a<=b) {
			System.out.println(a+"<="+b);
		}
		if(a>b) {
			System.out.println(a+">"+b);
		}
	}
	
}
