package Sample;

import java.util.Scanner;

import BasicsOfJava.Accessmodifier1;

// accessmodifier class classname{}
public class FitaJavaCourse {
	
	public void acces()
	{
		Accessmodifier1 a = new Accessmodifier1();
		a.add();
	}

	/*
	 * Methods
	 * 
	 * Syntax: Accessmodifier returntype methodname(arguments/parameter){}
	 * 
	 * four types of methods:
	 * Method without parameter/arguments
	 * Method with parameter /arguments
	 * -----------------------------------
	 * Method without return type
	 * Method with return type.
	 */
	
	public void PrintName()
	{
		System.out.println("My name is : Sathish");
		System.out.println("My age is : 50");
		System.out.println("My qualification is : b.tech");
		System.out.println("My desgintation is : Manager");
	}
	
	public void PrintNameDynamic(String name, int age,String auali,String designation)
	{
		System.out.println("My name is :"+name);
		System.out.println("My age is : "+age);
		System.out.println("My qualification is :"+auali);
		System.out.println("My desgintation is : "+designation);
	}
	
	public double GetInvoice(double amount1, double amount2)
	{
		double finalamount = amount1+amount2;
		return finalamount;	
	}
	
	public static void data()
	{
		System.out.println("data");
	}
	
	public void Taxcalculation(double amount1,double amount2)
	{
		double billamount =GetInvoice(amount1,amount2);
		System.out.println("your product amount is : "+billamount);
		double taxpercantage = 0.13;
		double taxamount = billamount*taxpercantage;
		System.out.println("your tax amount is : "+taxamount);
		double afterTaxamount = billamount+taxamount;
		System.out.println("Final bill amount is : "+afterTaxamount);
		
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.print("Fita Anna");
		System.out.print("nagar");
		System.out.println("chennai");
		FitaJavaCourse course = new FitaJavaCourse(); // instantiation
		course.PrintName();
		course.PrintName();
		/*Scanner name = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String actualName = name.next();
		course.PrintNameDynamic(actualName,20,"BBA","trainer");
		course.PrintNameDynamic("Google",45,"MBA","Java Student");*/
		course.Taxcalculation(500.25,820.67);
		course.Taxcalculation(750.25,820.67);
		// System.out.println("My name is : student1");
		// System.out.println("My name is : Student2");
		FitaJavaCourse.data();
	}
}
