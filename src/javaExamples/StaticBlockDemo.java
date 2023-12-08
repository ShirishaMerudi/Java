package javaExamples;

public class StaticBlockDemo
{
	int id;
	String name;
	static String cname ;
	
	//static block
	static
	{
		System.out.println("Static block is calling");
		System.out.println("Static block help to initialize static variable");
		cname = "ASM";
		
	}
	
	//Constructor
	public StaticBlockDemo(int id, String name)
	{
		System.out.println("Constructor is calling");

		this.id = id;
		this.name = name;
	}
	
	
	//method
	public void show()
	{
		System.out.println(" Method is calling");

		System.out.println("Student id is : "+id);
		System.out.println("Student name is : "+name);
		System.out.println("Student College name is : "+cname);


	}


	public static void main(String[] args) 
	
	{
		
		System.out.println("Main block is calling");
		System.out.println("-----------------------------");


		StaticBlockDemo s1 = new StaticBlockDemo(101, "Hema");
		s1.show();

	}

}
