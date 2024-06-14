package week3.day2;

public abstract class CanaraBank implements Payments
{
	public abstract void recordPaymentDetails();	
	
	public void upiPayments() 
	{
		System.out.println("UPI Payment available");		
	}	
}
