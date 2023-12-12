package ParameterPassing;

public class CalculatorClass 
{
	public int Add(int a, int b)
	{
		return (a+b);
		
	}
	
	public int Sub(int a, int b)
	{
		return (a-b);
				
	}
	
	public int mul(int a, int b)
	{
		return (a*b);
				
	}
	
	public int Div(int a, int b)
	{
		return (a/b);
				
	}
	
	
	

	public static void main(String[] args)
	{

		CalculatorClass CC = new CalculatorClass();
		
		int Addition = CC.Add(10, 20);
		System.out.println("Addition is :" +Addition);
		System.out.println();
		
		int Subtraction = CC.Sub(50, 20);
		System.out.println("Subtraction is :" +Subtraction);
		System.out.println();

		
		int Multiplication = CC.mul(5, 5);
		System.out.println("Multiplication is :" +Multiplication);
		System.out.println();

		
		int Division = CC.Div(60, 3);
		System.out.println("Division is :" +Division);
		System.out.println();

	
		
	}

}
