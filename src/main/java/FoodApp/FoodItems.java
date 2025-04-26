package FoodApp;

public class FoodItems {

	String[] ItemName = {"Idly","dosa","poori"};
	
	public boolean ItemExist(String expectedItemName)
	{
		for(String eachItem :ItemName)
		{
			if(eachItem.equalsIgnoreCase(expectedItemName))
			{
				return true;
			}
		}
		return false;
	}
	
	public void ItemAvailable(String ItemName)
	{
		if(ItemExist(ItemName)==true)
		{
			System.out.println("The given Item: "+ItemName+ "Exist");
		}
		else
		{
			System.out.println("Given Item: "+ItemName+" doesnt exist with us!!");
		}
	}

}
