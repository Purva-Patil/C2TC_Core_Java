package com.tns.corejava;

public class ExcHandling 
{

	public static void main(String[] args) 
	{
		int[] arr=new int[4];
		try
		{
			System.out.println(arr[4]);//Exception occurs
			
			System.out.println("Inside try block");
			
			
		}
		
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Inside catch block");
		}
		
		finally
		{
			System.out.println("Inside finally block");
		}
		System.out.println("Outside try catch finally block...Rest of the code");
	}

}
