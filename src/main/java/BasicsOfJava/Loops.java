package BasicsOfJava;

public class Loops {
	
	/*
	 * 3 loops
	 * for loop -- >definied no of iteration
	 * while loop -->iteration until condition fails
	 * do while loop  -> do that action and check the condition and iterate accordingly
	 */
	
	/*
	 * for(intialization;condition;increment/decrement){}
	 */
	public void forloop()
	{
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);*/
		/*for(int i=1;i<=8;i++)
		{
			if(i>=5 && i<=7)
			{
				continue ;
			}
			System.out.println(i);
			
		}*/
		
		for(int i=1;i<=8;i++)
		{
			System.out.println("I value is:  "+i);
			for(int j=1;j<=8;j++)
			{
				System.out.println("J value is:  "+j);
				if(j==5)
				{
				break;
				}
			}
			if(i==3)
			{
				break;
			}
		}
		
	}
	
	public void whileloop()
	{
		/*
		 * while(condition)
		 * {
		 * }
		 */
		int i=9;
		while(i<=8)
		{
			System.out.println(i);
			if(i==5)
			{
				break;
			}
			i=i+1;
		}
	}
	
	public void dowhile()
	{
		/*
		 * do
		 * {
		 * }while(condition);
		 */
		int i=9;
		do
		{
			System.out.println(i);
			i=i+1;
		}while(i<=8);
	}
	
	public void reverse()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loops L = new Loops();
		L.reverse();
	}

}
