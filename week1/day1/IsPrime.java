package week1.day1;

public class IsPrime {

	public static void main(String[] args) 
	{		
		int num=8;
		boolean isPrime=true;
		if (num>0)
		{
			for (int i = 2; i < num-1; i++) 
			{
				if(num%i==0)
				{
					System.out.println("Given number is not a prime number");
					isPrime=false;
					break;
				}			
				
			}
			
			if (isPrime==true) 
			{
				System.out.println("Given number is a prime number");
			} 
			
			
		}

	}

}
