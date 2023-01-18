package com.simple;

import java.util.Scanner;

public class Ans14 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number: ");
	int a=sc.nextInt();
	int c=a%10;
	int d=a/10;
	System.out.println("Result is :" +(c+d));
}
}
