package FoodApp;

public class Hotels extends FoodItems {
	
	String[] HotelName = {"SVB","A2B","B2B"};
	
	public boolean HotelExist(String expectedHotelName)
	{
		for(String eachHotel :HotelName)
		{
			if(eachHotel.equalsIgnoreCase(expectedHotelName))
			{
				return true;
			}
		}
		return false;
	}
	
	public void HotelAvailable(String hotelName)
	{
		if(HotelExist(hotelName)==true)
		{
			System.out.println("The given Hotel Exist");
		}
		else
		{
			System.out.println("Given hotel doesnt exist with us!!");
		}
	}

}
