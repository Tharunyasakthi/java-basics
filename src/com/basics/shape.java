package com.basics;

public class shape {
	double side;
	double length;
	double breadth;

	public shape(double side)
	{
	this.side=side;
	}
   public shape(double length,double breadth)
   {
	   if( length<20&&length>0&&breadth<20&&breadth>0)
	   {
		   this.length=length;
		   this.breadth=breadth;
	   }else
	   {
		 System.out.println("the values should be from");
	   }
   }
	public double findAreaofRec() {
		return length*breadth;
	}  
	public double findAreaofSquare() {
		return side*side;
	}
	public static void main(String args[]) {
		shape e1=new shape(5);
		shape e2=new shape(5,5);
		System.out.println(e1.findAreaofSquare());	
		System.out.println(e2.findAreaofRec());	
	}
}

