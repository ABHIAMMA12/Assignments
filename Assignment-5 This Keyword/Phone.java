package com.amma;
public class Phone 
{
	String brand;
	int IMEI;
	String color;
	int campx;
	float cost;
	long phone;
	int RAM;
	float storage;
	String review;
	boolean display_is_Amoled;
	public Phone(String brand, int iMEI, String color, int campx, float cost, long phone, int RAM, float storage,
			String review, boolean display_is_Amoled) 
	{
		this.brand = brand;
		this.IMEI =IMEI;
		this.color = color;
		this.campx = campx;
		this.cost = cost;
		this.phone = phone;
		this.RAM = RAM;
		this.storage = storage;
		this.review = review;
		this.display_is_Amoled = display_is_Amoled;
	}
	void good()
	{
		System.out.println(brand +" "+color+" color"+cost+" cost is good to use");
	}
	void bad()
	{
		System.out.println(brand +" "+color+"color"+cost+" cost is bad to use");
	}
}
