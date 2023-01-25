package com.simple;

import java.util.Scanner;

public class Ans21 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int a=sc.nextInt();
		int val,val1,temp,j;
		double count=0,k,sum=0;
		val1=val=a;
		
		while(a!=0) {
			temp=a/10;
			count++;
			a=temp;
		}
		
		while(val!=0) {
			k=val%10;
			j=val/10;
			sum=Math.pow(k, count)+sum;
			val=j;
		}
		
		if(val1==sum) {
			System.out.println("Armstrong Number.");
		}
		else {
			System.out.println("Not an Armstrong Number.");
		}
		
	}
}
