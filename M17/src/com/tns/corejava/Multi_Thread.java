package com.tns.corejava;

public class Multi_Thread {

	public static void main(String[] args) {
		
		MyThread t=new MyThread();//object creation
		t.start();
		for(int i=0;i<10;i++)
		{
		System.out.println("Main Thread");
		}

	}

}

class MyThread extends Thread//thread creation
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("Child Thread");
		}
	}
}