package com.Pattern.Level3;

public class Pattern17 {

	public static void main(String[] args) {
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
		    }
			System.out.println();
	    }
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
		    }
			System.out.println();
	    }
		//using while loop
		int i=1,j=1,k;
		
		while(i<=9)
		{
			j=1;
			if(i>5)
				k=10-i;
			else
				k=i;
		while(j<=k)
		{
			System.out.print("*");
			j++;
		}
		System.out.println();
		i++;
		}
		*/
		int k;
		for(int i=1;i<=9;i++)
		{
			if(i>5)
				k=10-i;
			else
				k=i;
			for(int j=1;j<=k;j++)
			{
			  System.out.print("*"); 	
			}
			System.out.println();
		}
			
		
		
		
		
	}

}
