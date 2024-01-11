package DataStructure;

public class MultiDArray {

	public static void main(String[] args) {

		int arr[][] = new int [3][4];
		arr [0][0]= 10;
		arr [0][1]= 20;
		arr [0][2]= 30;
		arr [0][3]= 40;
		
		arr [1][0]= 50;
		arr [1][1]= 60;
		arr [1][2]= 70;
		arr [1][3]= 80;
		
		arr [2][0]= 90;
		arr [2][1]= 100;
		arr [2][2]= 110;
		arr [2][3]= 120;
		
		System.out.println("Number of rows: " +arr.length);
		System.out.println("Number of Columns : "+arr[0].length);
		
		System.out.println(arr[1][2]);
 		
		
		System.out.println("-----------1----------");
		
		for (int r=0 ; r<arr.length;r++)
		{
			for(int c=0; c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]+"    ");
			}
			System.out.println();
			
			
		}
		System.out.println("-------**2**--------------");
		
		for(int r[]:arr)
		{
			for(int c:r)
			{
				System.out.print(c +"      ");
			}
			System.out.println();
		}
		
		System.out.println("----------3-----------");
		String data[][]= {{"Siri","Mumbai"}, {"Hema","Ulwe"} ,{"Naga","Seawoods"},{"Shirisha","Canada"} };
		System.out.println("Number of rows : " +data.length);
		System.out.println("Number of Columns : " +data[0].length);
		
		System.out.println(data[2][1]);
		
		for (int i=0; i<data.length;i++)
		{
			for (int j=0; j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"         ");
			}
			System.out.println();
		}
		System.out.println("***---------4------------");

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
