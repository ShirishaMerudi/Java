package javaExamples;

public class ThisWithConstructorCall 
{
	
	public ThisWithConstructorCall()
	{
		//this (101); //calling PC
		System.out.println("Default Constructor is calling");
		
	}
	
	public ThisWithConstructorCall(int id)
	{
		this ();
		System.out.println("Parameterized Constructor is calling:" +id);
		
	}
	
	

	public static void main(String[] args) 
	{
		//ThisWithConstructorCall t1 = new ThisWithConstructorCall();
		
		ThisWithConstructorCall t2 = new ThisWithConstructorCall(101);

		
	}

}
