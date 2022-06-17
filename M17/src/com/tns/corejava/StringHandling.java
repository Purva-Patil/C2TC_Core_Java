package com.tns.corejava;

public class StringHandling {

	public static void main(String[] args) {
		String s=new String("Purva"); //Immutable
		s.concat("Patil");
		System.out.println(s);
		
		StringBuffer s1=new StringBuffer("Purva");  //Mutable
		s1.append(" Patil");
		System.out.println(s1);
		
		String s2="Puru";
		System.out.println(s2);
		
		System.out.println(s2.length());    //Finding length of the string using
		
		String lower=s.toLowerCase();       //Converting string to lower case 
		System.out.println(lower);
		
		String upper=s.toUpperCase();       //Converting string to upper case using
		System.out.println(upper);
		
		System.out.println(s.trim());       // Trimming white spaces
		
		System.out.println(s.substring(2));  //Finding substring that start from index2
		
		System.out.println(s.substring(2,4));  //String start at index2 and ends at index4
		
		System.out.println(s.equals("purva")); //Finding if string is equal 
		
		System.out.println(s.equalsIgnoreCase("purva")); //Equalizing string ignoring case
		
		System.out.println(s.replace('P','U'));  //Replace characters here replacing P with U

	}

}
