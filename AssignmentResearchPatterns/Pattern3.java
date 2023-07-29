
//1 2 3 4 5 
//2 3 4 5 6 
//3 4 5 6 7 
//4 5 6 7 8 
//5 6 7 8 9 


package com.AssignmentResearchPatterns;

public class Pattern3 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=5;i++)
		{
			count+=1;
			for(int j=0;j<5;j++)
			{
				System.out.print(count+j+" ");
				
				
			}
			
			System.out.println();
		}
		
	}

}
