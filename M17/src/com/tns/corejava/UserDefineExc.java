package com.tns.corejava;

import java.util.Scanner;

public class UserDefineExc 
{
	public static void main(String[] args) 
	{
		int age;
		System.out.println("Enter the age:");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
	
		if(age<18)
		{
			throw new CantVote("You cannot cast vote");//Exception
		}
		else
		{
			System.out.println("You can vote");
		}
	
	}
}
class CantVote extends RuntimeException
{

	public CantVote(String msg) {
		super(msg);
		
	}

	
	
}