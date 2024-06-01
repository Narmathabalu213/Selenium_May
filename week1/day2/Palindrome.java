package week1.day2;

public class Palindrome {

	public static void main(String[] args) 
	{
		int input=121;
		int input1= input; //input1=121
		int output = 0;
		while(input>0)
		{
			
			int temp=input%10; //temp=1
			output=output*10 +temp;  //output=1
			input=input/10;  //input=12
				System.out.println(output);			
		}
		if(input1==output)
		{
			System.out.println("The given number is a palindrome");
		}
		else
		{
			System.out.println("The given number is not a palindrome");
		}
	}

}
