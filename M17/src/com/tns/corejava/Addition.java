package com.tns.corejava;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		System.out.println("Enter the numbers:");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		
		int sum=a+b;
		System.out.println("Sum of two numbers="+sum);

	}

}
