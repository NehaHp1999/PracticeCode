package com.simple;

import java.util.Scanner;

public class Ans22 {

	public static void main(String args[]) {
		int y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year:");
		y=sc.nextInt();
		if(y%100==0&&y%400==0 || y%100!=0&&y%4==0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
		}
	}
}
