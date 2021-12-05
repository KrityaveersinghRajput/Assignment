package com.geester;

class Variable
    {
	int price;
	int speed;
	String model;
	String color;
	public void car()
	{
		System.out.println ("car name:+ Auddi");
	}
	public void bike() {
		 System.out.println("bike name:+ bajaj");
	}
	
	}
 class Vehicle1
{
	public static void main(String args[])
	{
	Variable vec1= new Variable();
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
	

	


