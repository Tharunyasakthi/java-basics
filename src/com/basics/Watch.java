package com.basics;

public class Watch {
       String brand;
       double speed;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public static void main(String args[]) {
		Watch brands=new Watch();
		brands.setBrand("fastrack");
		System.out.println(brands.getBrand());
}
}