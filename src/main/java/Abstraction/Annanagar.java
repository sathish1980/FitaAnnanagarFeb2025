package Abstraction;

public class Annanagar extends testclass {

	public double tax(int amount)
	{
		System.out.println("your tax percentage is 13");
		double taxamount = amount*.13;
		System.out.println("Your tax amount is : "+ taxamount);
		return taxamount;
		
	}
	
	public void finalInvoice(int a)
	{
		/*
		 * tax calcualte
		 * tax amount+ billing amount
		 */
		double taxamount =tax(a);
		double finalAmount = taxamount+a;
		System.out.println("You final billing amount is : "+finalAmount);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annanagar A = new Annanagar();

		int billamount = A.invoice(300, 30);
		A.finalInvoice(billamount);
	}

}
