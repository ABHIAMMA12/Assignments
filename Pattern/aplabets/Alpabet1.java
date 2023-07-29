package com.Pattern.aplabets;

public class Alpabet1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			//ch='A';
			for(int j=1;j<=5;j++)
			{
				
				if(i==1||j==1||i==5)
				{
					System.out.print("*");
				}
				else if(j==4)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
			
			System.out.println();
		}

	}

}
 