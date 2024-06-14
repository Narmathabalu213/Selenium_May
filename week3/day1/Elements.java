package week3.day1;

public class Elements extends Button
{
	
	public static void main(String[] args) 
	{
		Elements ele= new Elements();
		ele.click();
		ele.setText("From Webelement");
		ele.submit();
		//Text field methods
		TextField textfield= new TextField();
		textfield.getText();
		//Checkbox button methods
		CheckBoxButton checkbox= new CheckBoxButton();
		checkbox.click();
		checkbox.submit();
		checkbox.clickCheckButton();
		//radio button methods
		RadioButton radio= new RadioButton();
		radio.click();
		radio.submit();
		radio.selectRadioButton();		

	}

}
