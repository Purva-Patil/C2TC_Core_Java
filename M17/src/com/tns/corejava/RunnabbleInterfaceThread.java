package com.tns.corejava;

public class RunnabbleInterfaceThread {

	public static void main(String[] args) {
		
		NewThread t=new NewThread();//object creation
		t.start();
		for(int i=0;i<10;i++)
		{
		System.out.println("Main Thread");
		}

	}

}

class NewThread extends Thread//thread creation
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("Child Thread");
		}
	}
}