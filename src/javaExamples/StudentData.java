package javaExamples;

public class StudentData {
	
	int id ;
	String name ;
	
	public void show()
	{
		System.out.println("Student ID is "+id);
		System.out.println("Student Name is "+name);
	}

	public static void main(String[] args) {

		StudentData s1 = new StudentData();
		s1.id = 101;
		s1.name = "Shirisha";
		s1.show();
		System.out.println("****************************");
		
		StudentData s2 = new StudentData();
		s2.id = 102;
		s2.name = "Hema";
		s2.show();
		System.out.println("****************************");

AccessModifier a1 = new AccessModifier();
		System.out.println("From different Student class..........");
		System.out.println("Student ID is "+a1.id);
		System.out.println("Student Name is " +a1.name);
		
	}

}
