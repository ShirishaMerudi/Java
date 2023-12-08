package javaExamples;

public class WrapperClass {

	public static void main(String[] args)
	{
		//object to primitive - wrapper class
		
		String s1= "100";
		System.out.println(s1+100);
		
		//string to integer
		int num = Integer.parseInt(s1);
		System.out.println("String to Int: " +(num+100));

		
		String s2 = "45.78";
		System.out.println(s2+21.12);
		
		//String to double
		double  d1 = Double.parseDouble(s2);
		System.out.println("String to Double:" +(d1+21.11));

		String s3 ="125";
		System.out.println(s3+2);
		
		//String to btye
		byte data = Byte.parseByte(s3);
		System.out.println("String to Byte : " +(data + 2));

		
		/*String is a class and is collection of of characters
		to get the character from string use charAt(index)
		index = starts from 0 to n
		
		*/
		String s4 ="Shirisha";
		
		//String to character
		char ch = s4.charAt(3);
		System.out.println("String to Character: " +ch);
		
		System.out.println("-----------------------------------");
		
		//primitive to Object
		int n1=80;
		System.out.println(n1+20);
		
		//int to String
		String SI1 = String.valueOf(n1);
		
		System.out.println("Integer to String: "+(SI1 +20));

		double d2 = 12.34;
		String SI2 = String.valueOf(d2);
		System.out.println("Double to String: "+(SI2 +20));

		long l1 = 99999999999L;
		String SI3 = String.valueOf(l1);
		System.out.println("Long to String: "+(SI3 +20));

		
		
		
		
		
	}

}
