package FoodApp;

public class name1 {
	
	String myName = "Sathish";
	
	public void printMyName(String name)
	{
		if(name.equalsIgnoreCase(myName))
		{
			System.out.println("Welcome "+myName);
		}
		else
		{
			System.out.println("You are not "+myName);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name1 n = new name1();
		n.printMyName("karthick");
	}

}
