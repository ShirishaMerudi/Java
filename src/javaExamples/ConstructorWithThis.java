package javaExamples;

public class ConstructorWithThis 
{
	/* this keyword -  
	 * to refer current class instance variable and instance method
	 * to call instance variable / method
	 * to call constructor - this()
	 * to differentiate instance variable and local variable
	 * 
	 * 
	 * */
	
	
	//instance data
	int id ;
	String name;
	
	public ConstructorWithThis(int id, String name)
	{
	//	id = id;
	//	name = name;
		
		//assigning the data to instance variable
		this.id = id;
		this.name = name;
		
		
	}
	
	public void show()
	{
		System.out.println("Id is :" +id);
		System.out.println("Name is :" +name);
	}
	
	public static void main(String[] args) 
	{
		ConstructorWithThis c1 = new ConstructorWithThis(101, "Hema");
		c1.show();
		
		
		
	}

}
