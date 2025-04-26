package Polymorphism;

public class MethodOverriding extends MethodOveloading {
	
	//overriding
	public void add1(int y, int z)
	{
		System.out.println(y-z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding M =new MethodOverriding();
		M.add(3, 2);
		M.add1(10,20);
		MethodOveloading M1 = new MethodOveloading();
		M1.add(2, 3);
	}

}
