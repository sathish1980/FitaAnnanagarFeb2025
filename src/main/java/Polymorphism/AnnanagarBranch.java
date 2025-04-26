package Polymorphism;

public class AnnanagarBranch extends Inventory {
	
	//overriding
	public void lux()
	{
		System.out.println("21");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnanagarBranch A = new AnnanagarBranch();
		A.lux();
		A.mysoreSandal();
		
	}

}
