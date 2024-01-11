package DataStructure;

public class ForEachLoop {

	public static void main(String[] args) {

		int sid[]= new int[5];
		sid[0]= 101;
		sid[1]= 102;
		sid[2]= 103;
		sid[3]= 104;
		sid[4]= 105;
		
		for(int i: sid)
		{
			System.out.println("Student Id is " +i);
			
		}
		
		System.out.println("-------------------------------");

		String location[ ]= new String[3];
		
		location[0]= "Navi Mumbai";
		location[1]= "Mumbai";
		location[2]= "Pune";
		
		for(String i: location)
		{
			System.out.println("Location is " +i);
			
		}
		
		System.out.println("-------------------------------");
		
		double marks[]= new double[4];
		marks[0]= 45.31;
		marks[1]= 65.56;
		marks[2]= 80.02;
		marks[3]= 95.21;
		
		for(double i: marks)
		{
			System.out.println("Marks is " +i);
			
		}
		
	}

}
