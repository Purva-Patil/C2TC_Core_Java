package com.tns.corejava;

interface A
{
	 void Adisplay();//declaration 
}
interface B
{
	void Bdisplay();
}
class MIE implements A,B//multiple inheritance
{
	@Override
	public void Bdisplay() {
		System.out.println("I AM A INTERFACE");
	}
	
	@Override
	public void Adisplay() {
		System.out.println("I AM B INTERFACE");
	}
}




public class Multiple_inheritance {

	public static void main(String[] args) {
		MIE m=new MIE();
		m.Adisplay();
		m.Bdisplay();

	}

}
