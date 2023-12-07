package javaExamples;

public class JavaMethods {

	public void accept()// instance method
	{
		System.out.println("This is instance method");
	}
	public static void display() // static method
	{
		System.out.println("This is static method");
	}
	
	public static void main(String[] args) 
	{
		display();
		JavaMethods.display();
		
		JavaMethods obj = new JavaMethods();
		obj.accept();
		
		
		
		
	}

}
