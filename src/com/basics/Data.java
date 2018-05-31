package com.basics;

public class Data{
    int month;
    int day;
    int year;

public Data() {
	
}
public Data(int month,int day,int year) {
	this.month=month;
	this.day=day;
	this.year=year;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public void DisplayDate() {
	System.out.println(month+"/"+day+"/"+year);
}
	public static void main(String args[]) {
		Data d1=new Data();
		d1.setDay(10);
		d1.setMonth(8);
		d1.setYear(1998);
		d1.DisplayDate();
		
	}
}