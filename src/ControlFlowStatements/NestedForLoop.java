package ControlFlowStatements;

public class NestedForLoop {

	public static void main(String[] args) {

		
		for(int num=1;num<=10;num++)//row
		{
			for(int c=1;c<=10;c++)//column
			{
			System.out.print("\t"+(num * c));
			}	
			System.out.println();
			System.out.println();

		}
		
		
		for (int a=1;a<=4;a++)
		{
			for (int b=1; b<=4 ; b++)
			{
				System.out.print("\t *");

			}
			System.out.println();

		}
		
		for (int d =1; d<=4 ; d++)
		{
			for (int e=1; e<=d;e++)
			{
				System.out.print(d+ " ");
			}
			System.out.println();

		}
		System.out.println();

			
		for (int f =1; f<=4 ; f++)
			{
				for (int g=1; g<=f;g++)
				{
					System.out.print(g+ " ");
				}
				System.out.println();
				
			}
		System.out.println();

		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
								
				System.out.print(k++ +" ");
			}
			System.out.println();
		}

		
	}

}
