package com.tns.corejava;

public class Sample {

	public static void main(String[] args) {
		int x=0;
		do
		{
			x++;//1 4 8
			System.out.println(x);
			
			if(++x<5)//2...true false
				continue;// skip the iteration current
			x++;//6 10
			
			System.out.println(x);
			
		}while(++x<10);//3<10 7<10 11<10

	}

}