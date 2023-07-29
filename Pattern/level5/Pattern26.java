package com.Pattern.level5;

public class Pattern26 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)+1;j++)
			{
				System.out.print("*");
			}
			 System.out.println();
			 
		}
		for(int i=1;i<=9;i++)
		{
			System.out.print("  ");
			for(int j=1;j<=9;j++)	
			{
				
				if(i==1||i==9||j==1||j==9)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
           
	}

}
