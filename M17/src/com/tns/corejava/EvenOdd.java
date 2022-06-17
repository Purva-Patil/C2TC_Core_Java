package com.tns.corejava;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter any number:");
		
		Scanner s=new Scanner(System.in);
		num=s.nextInt();          //input from the user
		
		if(num%2==0)
		{
			System.out.println("Number is Even.");
		}
		else
		{
			System.out.println("Number is Odd.");
		}

	}

}