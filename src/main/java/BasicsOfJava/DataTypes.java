package BasicsOfJava;

public class DataTypes {
	
	boolean status = true;
	int a=01234567;
	//long b= 01234567l;
	//float b =2.3f;
	double d =2.344;
	char e='e';
	String name= "sathish";
	
	// accessmodifier datatype variablename = value;
	// accessmodifier static datatype variablename = value;
	
	int newage = 30;  // global variable
	static int age = 30;  // static variable
	
	public void myage()
	{
		int amount1 =45; // local variable
		System.out.println(amount1);
		System.out.println(age);
	}
	
	public void amount()
	{
		//System.out.println(amount1);
		System.out.println(age);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
