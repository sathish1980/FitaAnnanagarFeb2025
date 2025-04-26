package BasicsOfJava;

public class VoterID {
	
	public void Getnumber(String value)
	{
		if(value.equalsIgnoreCase("A"))
		{
			System.out.println(1);
		}
		else if(value.equalsIgnoreCase("B")) {
			System.out.println(2);
		}
	}
	
	public void ValidateVoterIDIssue(String nationality,int age)
	{
		if(nationality.equalsIgnoreCase("Indian"))
		{
			if(age>18)
			{
				System.out.println("You are eligible to apply voter id");
			}
			else
			{
				int waitPeriod =18-age;
				System.out.println("You have to wait for "+waitPeriod+ " Years");
			}
		}
		else
		{
			System.out.println("You are not indian citizen hence you will not eligleble to apply voter id");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoterID voterid = new VoterID();
		voterid.ValidateVoterIDIssue("US", 25);
	}

}
