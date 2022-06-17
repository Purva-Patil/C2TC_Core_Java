package com.tns.corejava;

public class Array2 {

	public static void main(String[] args) {
		int[][][] x= {{{10,20,30}, {40,50,60}}, { {70,80}, {90,100,110} } };
		
		System.out.println(x[0][1][2]);//60
		System.out.println(x[1][0][1]);//80
		System.out.println(x[1][1][1]);//100
		
		System.out.println(x.length);
		
		
		
		

	}

}
