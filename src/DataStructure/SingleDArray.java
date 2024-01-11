package DataStructure;

public class SingleDArray {

	public static void main(String[] args) {

		int sid[]= new int[5];
		sid[0]= 101;
		sid[1]= 102;
		sid[2]= 103;
		sid[3]= 104;
		sid[4]= 105;
		
		int aln = sid.length;
		
		System.out.println("Length of the array is " +aln);
		System.out.println(sid[4]);
	//	System.out.println(sid[-2]);
		System.out.println();

		for (int i =0; i<aln; i++)
		{
			System.out.println(sid[i]);

		}
		System.out.println("-------------------------------");

		String location[ ]= new String[3];
		
		location[0]= "Navi Mumbai";
		location[1]= "Mumbai";
		location[2]= "Pune";
		int ll = location.length;
		
		System.out.println("Total no. of locations " +ll );
		System.out.println(location[0]);
		System.out.println();

		for (int i=0; i<ll; i++)
		{
			System.out.println(location[i]);

		}
		System.out.println("---------------------");
 
		double marks[]= new double[4];
		marks[0]= 45.31;
		marks[1]= 65.56;
		marks[2]= 80.02;
		marks[3]= 95.21;
		
		int ml = marks.length;
		
		System.out.println("Total marks length from array is " +ml );
		System.out.println("Total marks of the student is "+(marks[0]+marks[1]+marks[2]+marks[3]));
		System.out.println();
		
		for (int i=0 ; i<ml ; i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println("----------------------");
		// Array using literal way
		
		int arr[] = {10,20,30,40,50};
		System.out.println(arr[3]);
		System.out.println("Length is " +arr.length);
		
		for (int i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		
		char ch[]= {'A','B','C'};
		for (char c:ch)
		{
			System.out.println(c);
		}
		
		System.out.println("---------------------------");

Object empdata []= {"Siri","F", "Ulwe",44,9819002512L,45.67};
		
		for (Object i:empdata)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
