package Polymorphism;

public class MethodOveloading {

	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	
	public void add(int a, double b)
	{
		System.out.println(a+b);
	}
	
	public void add(double a, double b)
	{
		System.out.println(a+b);
	}
	
	public void add(double a, int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a, String b)
	{
		System.out.println("int string");
		System.out.println(a+b);
	}
	
	
	public void add(int a, int b, int c)
	{
		System.out.println("3 param");
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args)
	{
		MethodOveloading M = new MethodOveloading();
		M.add(2, "sathish");
		M.add(10, 20,30);
	}
}
