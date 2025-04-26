package Abstraction;

public abstract class testclass {
	
	public abstract double tax(int amount);
	
	public abstract void finalInvoice(int a1);
	
	public int invoice(int amount1, int amount2)
	{
		int finalamount = amount1+amount2;
		System.out.println(finalamount);
		return finalamount;
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		testclass t = new testclass();
		t.invoice(0, 0);
	//	t.tax();
	}*/

}
