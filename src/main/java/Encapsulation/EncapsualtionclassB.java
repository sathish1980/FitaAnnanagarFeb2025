package Encapsulation;

public class EncapsualtionclassB extends EncapsualtionclassA{

	public void GeMyNameAndAmount()
	{
		System.out.println(amount);
		//setMyName("Sathish");
		System.out.println(getMyName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsualtionclassB e = new EncapsualtionclassB();
		e.GeMyNameAndAmount();
	}

}
