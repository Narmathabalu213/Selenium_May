package week3.day1;

public class LoginTestData extends TestData
{
	public void enterUsername()
	{
		System.out.println("Please enter the username");
	}
	public void enterPassword()
	{
		System.out.println("Please enter the password");
	}
	public static void main(String[] args) 
	{
		LoginTestData login = new LoginTestData();
		login.navigateToHomePage();
		login.enterCredentials();
		login.enterUsername();
		login.enterPassword();
		
	}

}
