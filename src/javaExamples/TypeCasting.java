package javaExamples;

//Type Casting

public class TypeCasting {

	public static void main(String[] args) {

		//primitive to primitive
		//1. Implicit conversion[small to large size]
		//byte -->char-->short-->int-->long-->float-->double
		
		byte b=120;
		int a=b;
		System.out.println("Byte to Int: " +a);
		
		char c= 'P'; //2byte
		int d = c; //4byte
		System.out.println("Chat to Int: "+d);
		
		int x= 987466;//4byte
		float f1=x;//4 byte
		
		System.out.println("Int to float: " +f1);
				
		long l1=x;
		System.out.println("Int to Long: " +l1);

		System.out.println("---------------------------------------------------");
		
		//2.Explicit conversion [large to small size]
		//double-->float-->long-->int-->short-->char-->byte
		//casting operator (type)
		
		int y = 120; //4 byte
		char c2=(char) y; //2 byte
		
		System.out.println("Int to char: " +c2);

		long l2 = 9999999999999L ; //8 byte
		int s=  (int) l2; 
		
		System.out.println("Long to int : " +s);

		double d1 = 65.4587;
		int h = (int) d1;
		
		System.out.println("Double to Int: " +h);

			
		
		
		
	}

}
