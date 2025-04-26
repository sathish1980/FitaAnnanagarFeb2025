package CollectionConcpets;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class MAPInterfrace {
	
	/*
	 * MAP - Key and Value pair
	 * HashMap -- it does not maintain insertion order
	 * LinkedHashMAp --it maintain insertion order
	 * TreeMap --it maintain ascending order
	 */
	
	public void launch()
	{
		//HashMap<Integer,String> hs = new HashMap<>();
		//LinkedHashMap<Integer,String> hs = new LinkedHashMap<>();
		TreeMap<Integer,String> hs = new TreeMap<>();
		// CRUD
		
		System.out.println(hs);
		//add
		hs.put(10,"sathish");
		hs.put(21,"kumar");
		hs.put(3,"sathish");
		hs.put(1,"fita");
		hs.put(1, "santhosh");
		System.out.println(hs);
		
		// update
		hs.replace(10, "priya");
		System.out.println(hs);
		
		// remove
		hs.remove(2);
		//or
		hs.remove(2,"kumar");
		
		//read
		for(Map.Entry each :hs.entrySet())
		{
			System.out.println(each);
		}
		
		System.out.println("Keys: "+hs.keySet());
		System.out.println("Values: "+hs.values());
		
		/*Iterator t1= ((Object) hs).iterator();
		while(t1.hasNext())
		{
			System.out.println(t1.next());
		}*/
		
		System.out.println(hs);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MAPInterfrace M = new MAPInterfrace();
		M.launch();
	}

}
