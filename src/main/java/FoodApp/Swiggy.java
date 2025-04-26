package FoodApp;

import java.util.Scanner;

public class Swiggy extends Orders{

	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Swiggy s = new Swiggy();
		String hotelname;
		try {
			hotelname = s.getUserInput("hotel");
			s.HotelAvailable(hotelname);
			s.ItemExistorNot(hotelname);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

}
