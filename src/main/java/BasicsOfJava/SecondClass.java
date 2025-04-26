package BasicsOfJava;

import java.util.Scanner;

public class SecondClass {
	
	
	public SecondClass()
	{
		System.out.println("I am constructor");
	}
	
	public SecondClass(int age)
	{
		System.out.println("I am constructor with parameter"+age);
	}
	
	
	public void printmyAge(int age)
	{
		System.out.println("My age is :"+age);
	}
	public void PrintMyName(String name)
	{
		printmyAge(20);
		System.out.println("Myname is : "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondClass s = new SecondClass(30);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = input.next();
		s.PrintMyName(name);
		s.printmyAge(20);
		//Resume r = new Resume();
		

		
	}
	
	
	/*accessmodifier class classname
	{
		accessmodifier classname()
		{
			
		}
	}*/

}
