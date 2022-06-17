package com.tns.corejava;

public class Abstract_Demo {

	public static void main(String[] args) {
		Scooty Activa=new Scooty();
		Activa.noofwheels();

	}

}
abstract class vehicle   //partially implemented class
{
	 abstract public void noofwheels();
}

 class Scooty extends vehicle
{

	@Override
	public void noofwheels() {
		System.out.println("No of wheels in scooty ="+2);
		
		
	}
	
}