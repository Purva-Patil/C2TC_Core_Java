package com.tns.corejava;

public class Method_Overriding {

	public static void main(String[] args) {
		

	}

}
class Parent
{
	void property()
	{
		System.out.println("house...money...jwellery");	
	}
	void marry()
	{
		System.out.println("SRI LATA");//definition
	}
}
class Child extends Parent
{
	void marry()
	{
		System.out.println("KATRINA");//new definition...overriding
	}
}