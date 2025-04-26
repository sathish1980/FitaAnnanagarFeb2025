package BasicsOfJava;

public class doubts {
	
	String myNAme = "sathish,kumar";
	String[] myNames = {"sathish","raja","kumar","FITA"};
	
	public void GetMyNAme()
	{
		System.out.println(myNAme);
		System.out.println(myNames[0]);
		for(int i=0;i<myNames.length;i++)
		{
			System.out.println(myNames[i]);
		}
		
		for(String value :myNames)
		{
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubts d = new doubts();
		d.GetMyNAme();
	}

}
