
package com.geester;

public class kk {

	
	
		public static void main(String args[])
		{
		  Vehicle2 vec= new Vehicle2();
		  vec.setprice(1000);
		  vec.setspeed(100);
		  vec.setmodel("audii");
		  vec.setcolor("red");
		  System.out.println("price="+vec.getprice());
		  System.out.println("speed="+vec.getspeed());
		  System.out.println("model="+vec.getmodel());
		  System.out.println("color="+vec.getcolor());
	     
		  Vehicle1 vec1= new Vehicle1();
		  vec1.price=2000;
		  vec1.speed=100;
		  vec1.model="audii";
		  vec1.color="red";
		  System.out.println("price="+vec1.price);
		  System.out.println("speed="+vec1.speed);
		  System.out.println("model="+vec1.model);
		  System.out.println("color="+vec1.color);
	}

}
// kv ps