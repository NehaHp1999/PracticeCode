package com.simple;

import java.util.Scanner;

public class Ans18 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int flag=0;
		System.out.println("Enter Number: ");
		int a=sc.nextInt();
		for(int i=2;i<=(a-1);i++) {
			int res=a%i;
			if(res==0) {
				flag=1;
			}
		}
		if(flag==1) {
			System.out.println("Not a Prime Number");
		}
		else {
			System.out.println("Prime Number");
		}
	}
}
