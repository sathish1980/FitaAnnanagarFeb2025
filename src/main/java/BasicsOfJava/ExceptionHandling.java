package BasicsOfJava;

import java.io.IOException;

public class ExceptionHandling {
	
	final int a3=10;
	
	/*public void data()
	{
		a=a+5;
		
	}*/
	public void div(int a, int b) throws Throwable
	{
		
		try
		{
			// finalize();
			int c =a/b;
			System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Hey its arithmetic execption plase check your input");
			
		}
		catch(Exception a1)
		{
			System.out.println(a1);
			
		}
		finally
		{
			b=b+2;
			System.out.println("b: "+ b);
			int c= a/b;
			System.out.println("finally : "+c);	
		}
	}
	
	public void add(int a, int b) throws IOException,ArithmeticException
	{
		int c =a+b;
		System.out.println(c);
	}
	
	public void MyName(String name)
	{
		if(name.equalsIgnoreCase("Sathish"))
		{
			System.out.println("Hey Sathish Welcome");
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("Hey you are not sathish . please enter your valid cresntials");
			
		}
		//System.out.println("sathish");
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ExceptionHandling E = new ExceptionHandling();
		E.div(20, 0);
		E.add(2, 3);
		E.MyName("Sathish Kumar");
	}

}
