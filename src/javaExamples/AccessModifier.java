package javaExamples;

public class AccessModifier {
	
	int id = 101 ;
	public String name = "Siri";
	private int phno = 123456 ;
	
	

	public static void main(String[] args) {

		System.out.println("hello");
		JavaMethods.display(); // called from class JavaMethods
		
		AccessModifier a1 = new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
	}

}
