package ControlFlowStatements;

public class BranchingStatements {
	
	public static String info(String msg)
	{
		return msg;
	}

	public static void main(String[] args) {
		
		//break statement you can use in switch and in loop
		
		for (int i=1; i<+10;i++)
		{
			if(i==5)
			{
				break;
			}else
			{
				System.out.println(i);
			}
		}
		System.out.println();
		//continue - skip certain part of the code
		for(int i=1;i<=10;i++)
		{
			if (i==5)
			{
				continue;
			}else
			{
				System.out.println(i);
			}
		}
		System.out.println();

		//return - return any result/data/output from method
		
		String res = info("hello");
		
		System.out.println(res);
	}

}
