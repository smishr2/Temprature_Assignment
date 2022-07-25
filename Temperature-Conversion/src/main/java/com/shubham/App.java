package com.shubham;

public class App {
	
	
	public static void main(String [] args)
	{
		
		
				
				// System.out.println("Enter the source: ");
		if(args.length>0)
		{
				 String S="";
					S=args[0];
				
				 

				// System.out.println("Enter the Value");
					double value;
					
					value=Double.parseDouble(args[1]);
					
				 //System.out.println("Enter destination");
				 String D="";
					D=args[2];
									
				
					switch(S)
					 {
					 case "C":
						if(D=="F")
						{
							Celsius_to_Fahrenheit cf=new Celsius_to_Fahrenheit();
							cf.convert(value);
						
							break;
						}
						
						else
						{
							Celsius_to_Kelvin ck= new Celsius_to_Kelvin();
							ck.convert(value);
							
							break;
						}
						 
					 case "F":
						 if(D=="C")
							{
							 Fahrenheit_to_Celsius fc=new Fahrenheit_to_Celsius();
								fc.convert(value);
							 
								break;
							}
							
							else
							{
								Fahrenheit_to_Kelvin fk=new Fahrenheit_to_Kelvin();
								fk.convert(value);
								break;
							}
						 
					 case "K":
						 if(D=="C")
							{
							 Kelvin_to_Fahrenheit kf=new Kelvin_to_Fahrenheit();
								kf.convert(value);
								break;
							}
							
							else
							{
								Kelvin_to_Celsius kf=new Kelvin_to_Celsius();
								kf.convert(value);
								break;
							}
						 
						
						 
					 }		
	

}
}
}
