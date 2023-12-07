package javaExamples;

public class VariableTypes {
	int id =101; //instance variable
	static String cname = "ASM";
	
	public void show()
	{
		int marks = 90;//local variable
		System.out.println("Marks from show :" +marks);
		System.out.println("ID is : "+id);
		System.out.println("Collage Name : "+cname);
	}

	
	
	public static void main(String[] args) {
		
		System.out.println("Collage Name in main is:" +cname);
		VariableTypes obj = new VariableTypes();

		System.out.println("Student id is :" +obj.id);
		int marks = 100; //local variable
		System.out.println("marks from main  :"+marks);
		
		System.out.println();

		obj.show();
		
		
		
		

	}

}
