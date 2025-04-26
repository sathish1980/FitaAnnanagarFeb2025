package Abstraction;

public class Tambaram extends testclass{

	final int a=10;
	public double tax(int amount)
	{
		System.out.println("your tax is 12 % ");
		double taxamount = amount*.12;
		System.out.println("Your tax amount is : "+ taxamount);
		//return taxamount+amount;
		return taxamount;
	}
	
	public void finalInvoice(int billingamount)
	{
		double taxamount = tax(billingamount);
		double finalamount = taxamount+billingamount;
		System.out.println("You final amount is : "+finalamount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tambaram T = new Tambaram();
		int billingamount = T.invoice(100, 200);
		T.finalInvoice(billingamount);
		
	}

}
