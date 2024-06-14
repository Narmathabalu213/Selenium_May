package week3.day1;

public class OverLoading 
{
	public void reportStep(String msg, String status)
	{
		System.out.println(msg + status);
	}
	public void reportStep(String msg, String status, boolean snap)
	{
		System.out.println(msg + " " + status+ " " +"Screenshot: " + snap);
	}
	public static void main(String[] args) 
	{
		OverLoading ol= new OverLoading();
		ol.reportStep("Report Step method ", "status: Overloaded");
		ol.reportStep("Report Step method ", "status: Overloaded;", false);
	}
	
}
