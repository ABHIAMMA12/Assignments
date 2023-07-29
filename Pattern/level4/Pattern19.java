package com.Pattern.level4;

public class Pattern19 {
	public static void main(String[] args) {
		char c;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i+5;j++)
			{
				if(j<i)
				{
					c='#';
			  }
				else
				{
					c='*';
				}
				System.out.print(c);
				
			}
			
			System.out.println();
		}
	}

}
