package BasicsOfJava;

public class Conditions {
	
	public void TrafficSignal(String color,String vehicleType,boolean patient)
	{
		
		if(color=="green")
		{
			System.out.println("You are good to go");
		}
		else if(color=="red")
		{
			/*if(vehicleType.equalsIgnoreCase("Ambulance"))
			{
				if(patient==true)
				{
				System.out.println("Hey i am ambulance please give me a way");
				}
				else
				{
					System.out.println("You have tp stop");
				}
			}
			else
			{
			System.out.println("You have tp stop");
			}*/
			
			
			if(vehicleType.equalsIgnoreCase("Ambulance") && patient==true)
			{
				System.out.println("Hey i am ambulance please give me a way");
			}
			else
			{
			System.out.println("You have tp stop");
			}
		}
		else if(color=="orange")
		{
			System.out.println("You have about to stop");
		}
		else
		{
			System.out.println("you have provided incorrect color");
		}
	}
	
	
	public void Gender(String gendercode)
	{
		switch(gendercode)
		{
		case "M":
			System.out.println("You are male");
			break;
		case "F":
			System.out.println("You are Female");
			break;
		case "T":
			System.out.println("You are Transgender");
			break;
		default:
			System.out.println("Incorrect code");
			break;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditions c = new Conditions();
		c.TrafficSignal("red","ambulance",true);
		c.Gender("Z");
	}

}
