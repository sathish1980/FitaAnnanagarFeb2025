package BasicsOfJava;

public class Accessmodifier1 {
	
	private int age =40;

	public void add()
	{
		System.out.println(2+3);
		System.out.println(age);
	}
	
	public void sub()
	{
		System.out.println(3-3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessmodifier1 A = new Accessmodifier1();
		A.add();
		System.out.println(A.age);
	}

}
