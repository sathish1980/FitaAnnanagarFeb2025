package CollectionConcpets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
	
	public void launch()
	{
		//HashSet<String> hs = new HashSet<>();
		//LinkedHashSet<String> hs = new LinkedHashSet<>();
		TreeSet<String> hs = new TreeSet<>();
		//CRUD operation
		// Create Read Update Delete.
		System.out.println(hs);
		hs.add("fita");
		hs.add("fita");
		hs.add("java");
		hs.add("c#");
		hs.add("python");
		hs.add("fita");
		System.out.println(hs);
		ArrayList<String> AL = new ArrayList<>();
		// read
		for(String value :hs)
		{
			System.out.println(value);
			AL.add(value);
		}
		
		System.out.println("ArrayList "+ AL);
		AL.set(2, "REACT");
		System.out.println("ArrayList "+ AL);
		hs.clear();
		System.out.println("Set "+ hs);
		for(String value :AL)
		{
			System.out.println(value);
			hs.add(value);
		}
		Iterator t1= hs.iterator();
		while(t1.hasNext())
		{
			System.out.println(t1.next());
		}
		
		//update
		// no update

		
		//delete
		hs.remove("python");
		
		System.out.println(hs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetInterface s = new SetInterface();
		s.launch();
	}

}
