package Abstraction;

public class InterfaceImplementation  implements TestInterface  {

	public void tax(int a)
	{
		System.out.println(TestInterface.name);
		//name = name+"Kumar";
		
		double taxpercentage =0.13;
		double taxamount = a*taxpercentage;
		double finalamount = taxamount+a;
		System.out.println("Your final amount = "+finalamount);
		//return finalamount;
	}
	public double tax1(int a)
	{
		System.out.println(TestInterface.name);
		//name = name+"Kumar";
		
		double taxpercentage =0.13;
		double taxamount = a*taxpercentage;
		double finalamount = taxamount+a;
		System.out.println("Your final amount = "+finalamount);
		return finalamount;
	}
	
	/*public void test()
	{
		System.out.println(tax(10));
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface1 I = new InterfaceImplementation();
		I.tax(20);
	}

}
