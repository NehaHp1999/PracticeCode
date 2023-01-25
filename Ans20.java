package com.simple;

import java.util.Scanner;

public class Ans20 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int a=sc.nextInt();
		int val=1,count=0,temp,temp1=0,rem,rev=0;
		while(val<a) {
			val=val*10;
			count++;
		}
		temp1=a;
		while(temp1>0) {
			rem=temp1%10;
			temp=temp1/10;
			temp1=temp;
			rev=rem+(rev*10);
		}
		
		if(a==rev) {
			System.out.println("Number is Palindrome.");
		}
		else {
			System.out.println("Number is not Palindrome.");
		}
	}
}
