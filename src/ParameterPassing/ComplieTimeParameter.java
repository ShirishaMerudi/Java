package ParameterPassing;

public class ComplieTimeParameter 
{
	//method without parameter
	public void add() // zero parameter method
	{
		int a = 100,b=30;//local variable
		System.out.println("Additioin is : "+(a+b));
	}
	
	//method with parameter without return
	public void sub(int a, int b) // 2 parameter, local variable
	{
		System.out.println("Subtraction is :" +(a-b));
		
	}
	
	//method with parameter with return keyword
	/*return keyword return data/result from method to calling function/method
	 * return type of method should be changed
	*/
	
	
	public int mul(int a, int b)
	{
		return (a*b);
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) 
	{
		ComplieTimeParameter c1 = new ComplieTimeParameter();
		c1.add();
		
		//compile time parameter passing without return
		c1.sub(100, 20);
		
		System.out.println("Multiplication is :" +c1.mul(5, 5));
		//or
		int result = c1.mul(15, 2);
		System.out.println("Multiplication is :" +result);
		
		
	}

}
