package javaExamples;


//	 * to call instance variable / method

public class ThisMethodCall 
{
	public void m1()
	{
		System.out.println("M1 Method");
		//this.m2(); // directly calling m2 from m1
	}

	public void m2()
	{
		System.out.println("M2 Method");
		this.m1(); // directly calling m1 from m2

	}

	
	
	public static void main(String[] args) 
	{
		ThisMethodCall obj = new ThisMethodCall();
		
		//obj.m1();
		
		obj.m2();
		
		
	}

}
