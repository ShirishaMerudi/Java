package javaExamples;

public class ConstructorEx 
{
	int id = 121 ;
	String name = "Siri";
	
	//Default Constructor
	public ConstructorEx()
	{
		System.out.println("Default Constructor");
		System.out.println("Id is :"+id);
		System.out.println("Name is :"+name);

	}
	
	//parameterized Constructor
	public ConstructorEx(int i, String n)//locala parameter i & n
	{
		//intialize instance variable
		id = i;
		name = n;
		System.out.println();
		System.out.println( "Parameterizzed Constructor is calling");
		System.out.println("Id is :"+id+ " & Name is:" +name);

		
		
	}
	
	
	public static void main(String[] args) 
	{
		JavaMethods.display();
		
		
		
		ConstructorEx c1 = new ConstructorEx();
		ConstructorEx c2 = new ConstructorEx(122, "Hema");

		
		
		
	}

}
