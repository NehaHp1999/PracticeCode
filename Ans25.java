package com.simple;

import java.util.ArrayList;
import java.util.Scanner;

public class Ans25 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=100,sum=0,i=1,j;
	while(n!=0) {
		int count=0;
		for(j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		
		if(count==2) {
			sum=sum+i;
			n--;
		}
		i++;
	}
	System.out.println("Sum of first 100 prime number is:"+sum);
}
}
