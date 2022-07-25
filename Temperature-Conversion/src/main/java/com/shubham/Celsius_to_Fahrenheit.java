package com.shubham;

public class Celsius_to_Fahrenheit implements TemConvertor {
	
	public void convert(double value)
	{
		System.out.println("Enter the value ");
		//double value=Double.parseDouble(args[1]);
		System.out.println(" "+ value + " Degree Celsius is equal to "+ ((value*1.8)+32) + "Fahrehheit");
	}
	


}
