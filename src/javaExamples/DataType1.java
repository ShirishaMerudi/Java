package javaExamples;

public class DataType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=397,b=20;
		double div=a/b;
		System.out.println ("Division of a & b is equal to "+div);
		
		int c=35,d=20;
		int Multi=c*d;
		System.out.println ("Multipliction of c & d is equal to "+Multi);
		
		System.out.println("Division is " +(c/d)); //gives the quotient after dividing
		System.out.println("Modulus is " + (c%d) ); //gives the remainder after dividing the numbers
	
		
		System.out.println("-----------------------------------------------------");
	//boolean
		boolean status = true;
		System.out.println("Boolean data is: " +status);
		
		status = false;
		System.out.println("updated boolean data is: " +status);
		
		boolean newstatus = true;
		System.out.println("New status is: " +newstatus);
	
		System.out.println("-----------------------------------------------------");
		//Character type
		
		char c1 ='H';
		System.out.println("Char Data is :" +c1);
		char c2 ='$';
		System.out.println("Char Data is :" +c2);
		
		//ASCII
		char c3 = 90;
		System.out.println("Char Data for 90 is :" +c3);
		
		//integer byte
		//byte range  -128 to 127
		byte b1 =120;
		System.out.println("byte data is : "+b1);


		//short 2byte -32768 to 32767
		short s1 = 15000;
		System.out.println("short data is: "+s1);
		
		
		//integer done at the start
		
		//long 8byte
		long L1 = 12345678901L;
		System.out.println("Long data is: "+L1);
		
		
		//floating values - decimal digits - float 4byte & double 8byte
		
		double d1 = 123.45;
		System.out.println("Double data is: " +d1);
		
		float f1 = 12.35F;
		System.out.println("Float data is: " +f1);

		
		
		
		
		
		
	
	
	
	
	}

}
