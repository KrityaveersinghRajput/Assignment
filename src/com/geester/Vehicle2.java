package com.geester;

class Getset
{
	int price;
	int speed;
	String model;
	String color;
	
public int getprice()
	{
		return this.price;
	}
public int getspeed()
	{
		return this.speed;
	}
public String getmodel() 
    {
		 return this.model;
	}
public String getcolor()
    {
		return  this.color;
	}
	public void setprice(int price)
	{
		this.price=price;
	}
	public void setspeed(int speed)
	{
		this.speed=speed;
	}
	public void setmodel(String model )
	{
		this.model=model;
	}
	public void setcolor(String color)
	{
		this.color=color;
	}
}
class Vehicle2
{
public static void main(String args[])
{
  Getset vec = new Getset();
  vec.setprice(1000);
  vec.setspeed(100);
  vec.setmodel("audii");
  vec.setcolor("red");
  System.out.println("price="+vec.getprice());
  System.out.println("speed="+vec.getspeed());
  System.out.println("model="+vec.getmodel());
  System.out.println("color="+vec.getcolor());
 }
}

