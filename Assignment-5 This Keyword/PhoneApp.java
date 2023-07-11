package com.amma;
import java.util.*;

public class PhoneApp {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the brand:");
		String brand=obj.nextLine();
		System.out.println("Enter the IMEI number:");
		int IMEI=obj.nextInt();
		obj.nextLine();
		System.out.println("Enter the color:");
		String color=obj.nextLine();
		System.out.println("Enter the camera resolution:");
		int campx=obj.nextInt();
		System.out.println("Enter the phone cost:");
		float cost=obj.nextFloat();
		System.out.println("Enter the phone number:");
		long phone=obj.nextLong();
		System.out.println("Enter the ram :");
		int RAM=obj.nextInt();
		System.out.println("Enter the storage:");
		float storage=obj.nextFloat();
		obj.nextLine();
		System.out.println("givwe the review:");
		String review=obj.nextLine();
		System.out.println("is display amoled or not:");
		boolean display_is_Amoled=obj.nextBoolean();
		Phone p=new Phone(brand,IMEI,color,campx, cost, phone, RAM, storage, review, display_is_Amoled);
		System.out.println(p.brand);
		System.out.println(p.IMEI);
		System.out.println(p.color);
		System.out.println(p.campx);
		System.out.println(p.cost);
		System.out.println(p.phone);
		System.out.println(p.RAM);
		System.out.println(p.storage);
		System.out.println(p.review);
		System.out.println(p.display_is_Amoled);
		p.good();
		p.bad();
	

	}

}
