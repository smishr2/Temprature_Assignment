//import java.util.Scanner;

public class Temprature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the source: ");
		 char S=sc.next().charAt(0);
		 System.out.println("Enter the Value");
		 double value=sc.nextDouble();
		 System.out.println("Enter destination");
		 char D=sc.next().charAt(0);*/
		
		String S="";
		S=args[0];
		double value;
		value=Double.parseDouble(args[1]);
		String D="";
		D=args[2];
		
		
		 
		 
		 switch(S)
		 {
		 case "C":
			if(D=="F")
			{
				System.out.println(" "+ value + " Degree Celsius is equal to "+ ((value*1.8)+32) + "Fahrehheit");
				break;
			}
			
			else
			{
				System.out.println(" "+ value + " Degree Celsius is equal to "+ (value + 273.15) + "Kelvin");
				break;
			}
			 
		 case "F":
			 if(D=="C")
				{
					System.out.println(" "+ value + " Fahrehheit is equal to "+(((value-32)*5)/9 )+ "Celsius");
					break;
				}
				
				else
				{
					System.out.println(" "+ value + " Fahrehheit is equal to "+ ((value - 32) * 5/9 + 273.15) + "Kelvin");
					break;
				}
			 
		 case "K":
			 if(D=="C")
				{
					System.out.println(" "+ value + " Kelvin is equal to "+ ( value - 273.15) + "Celsisus");
					break;
				}
				
				else
				{
					System.out.println(" "+ value + " Degree Celsius is equal to "+ (value - 273.15) * 9/5 + 32 + "Fahrehheit");
					break;
				}
		 }
		 

	}

}
