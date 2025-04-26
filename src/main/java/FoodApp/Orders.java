package FoodApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Orders extends Hotels {
	
	
	String s="value";
	ArrayList<String> items = new ArrayList<>();
	
	
	public void getData()
	{
		Scanner s1 = new Scanner(System.in);
		while(!s.equalsIgnoreCase("stop"))
		{
			
			System.out.println("Enter item1: ");
			s= s1.next();
			if(!s.equalsIgnoreCase("stop")) {
				items.add(s);
				}
		}
		System.out.println("the items are: "+items);
		System.out.println("Are you sure you ae cofor with your order plese give Y/N");
		String finaloutput = s1.next();
		if(finaloutput.equalsIgnoreCase("Y"))
		{
			System.out.println("Thanks for your order and please find the Items below,");
		
			for(String each :items)
			{
				System.out.println(each);
			}
		}
		else
		{
			System.out.println(" No problem");
		}
	}

	public void ItemExistorNot(String hotelname) throws InterruptedException
	{
		if(HotelExist(hotelname)==true)
		{
		String foodname =getUserInput("food");
		ItemAvailable(foodname);
		}
	}
	
	public String getUserInput(String name) throws InterruptedException
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter "+name+" Name : ");
		if(name.equalsIgnoreCase("hotel"))
		{
			for(String a: HotelName)
			{
				System.out.print(a);
				System.out.print("\t");
			}
		}
		else if(name.equalsIgnoreCase("food"))
		{
			for(String a: ItemName)
			{
				System.out.print(a);
				System.out.print("\t");
			}
		
		}
		System.out.println("");
		String names =input.nextLine();
		return names;
	}
	
	public static void main(String[] args)
	{
		Orders o = new Orders();
		o.getData();
	}
}
