package week3.day2;

public class Amazon extends CanaraBank
{
	public void recordPaymentDetails()
	{
		System.out.println("Record payment details");
	}	
	public void cashOnDelivery() 
	{
		System.out.println("Cash on delivery available");		
	}	
	public void cardPayments() 
	{
		System.out.println("Card Payment available");		
	}
	public void internetBanking() 
	{
		System.out.println("Internet Banking available");		
	}
		public static void main(String[] args) 
	{
		Amazon amazon= new Amazon();
		amazon.recordPaymentDetails();
		amazon.cardPayments();
		amazon.cashOnDelivery();
		amazon.internetBanking();
		amazon.upiPayments();
	}

}
