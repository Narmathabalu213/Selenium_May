package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) 
	{
		int[] num = {2,5,7,7,5,9,2,3};
		int arraylength = num.length;
		System.out.println("The given array length is :" + arraylength);
		System.out.println("**************************");
		
		//first method
	   for(int i=0;i<arraylength-1;i++)
		{
			for(int j=i+1;j<=arraylength-1;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println("The duplicate value is: " + num[j]);
				}
			}
		}
		System.out.println("**************************"); 
		
		//second method
		Arrays.sort(num);
		for(int k=0;k<arraylength-1;k++)
		{
			if(num[k] == num[k+1])
			{
				System.out.println("The duplicate value is: " + num[k+1]);
			}
		} 
		
	}

}
