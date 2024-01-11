package DataStructure;

public class StringDemo {

	public static void main(String[] args) {

		/*String is a immutable class in java
		*It is a colleciton of characters
		*Ways:
		*1.Literal
		*2.object is created inside SCP(String constant pool)
		*
		*/
		String s1="Hello";
		String s2="Hello";
		
		//to coompare JVM ids for object
		System.out.println(s1==s2);
		
		String s3 = new String("Hello");
		System.out.println(s1==s3);
		
		System.out.println("---------------------------------------");
		
		s1 = s1 + " All" ;
		System.out.println(s1);
		System.out.println(s1==s2);
		
		System.out.println("----------------------------------");
		
		//length()=char+space
		
		System.out.println("To calculate length of a string: " +s1.length());
		
		//conversion = toUpperCase() toLowerCase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		/*
		 * Equality of strings(methods= data   Operator(==)=id)
		 * equals()= exact matching but case sensitive
		 * equalsIgnoreCase() = exact matching but not case sensitive
		 */
		String act = "Selenium is automation library";
		String exp = "Selenium is automation Library";
		
		//System.out.println("Using equals() : "+act.equals(exp));
		
		System.out.println("Using equals() : "+act.equals(exp));
		System.out.println("Using equalsIgnoreCase():" +act.equalsIgnoreCase(exp) );
		
		//concatination
		//concat() / +
		
		System.out.println(s1.concat( " "+act));
		
		
		//trim
		
		//charAt(index)
		
		//contains()
		
		//startsWith()
		
		//endsWith()
		
		
		//split()
		
		
		//How to reverse string with and without method
		
		
		
		
		
		
		
		
		
		
	}
	
}
