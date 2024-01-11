package DataStructure;

public class ArrayAssign {

	public static void main(String[] args) {
		
		
		String data[][]= {{"USERNAME","PASSWORD"}, {"Admin   ","Admin123"} ,{"Tester1 ","Test123"},{"Tester2 ","Test123"},{"Tester3 ","Test123"},{"Tester4 ","Test123"} };
		int r = data.length - 1;
		System.out.println("Number of rows : " +r);
		System.out.println("Number of Columns : " +data[0].length);
		
		System.out.println();
		
		for (int i=1; i<data.length;i++)
		{
			for (int j=0; j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"         ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		System.out.println("Number of rows : " +r);
		System.out.println("Number of Columns : " +data[0].length);
		System.out.println();


		for(String i[] : data)
		{
			for(String j:i)
			{
				System.out.print(j + "        ");
			}
			System.out.println();
		}
	}

}
