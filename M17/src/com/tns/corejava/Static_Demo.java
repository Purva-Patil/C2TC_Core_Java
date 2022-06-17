package com.tns.corejava;

public class Static_Demo {
		String name;
		int roll;
		static String college="St. John College of Engineering and Management"; //class bound
		
		

		void display()
		{
			System.out.println(roll+" "+name+" "+college);

		}
		
		static void change()
		{
			 college="Mumbai University";
		}
		
		public Static_Demo(String name, int roll) {
			super();
			this.name = name;
			this.roll = roll;
			
		}


		public static void main(String[] args){
			Static_Demo s1=new Static_Demo("Alia",1);
			Static_Demo s2=new Static_Demo("Urvashi",2);
			s1.display();
			s2.display();
			
			Static_Demo.change();
			s1.display();
			s2.display();
		}

}