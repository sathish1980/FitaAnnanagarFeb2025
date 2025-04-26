package CollectionConcpets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListConcetps {
	
	//ArrayList<String> al = new ArrayList<>();
	String name ="Fita";
	String[] names= {"FITA","FITA","JAVA"};
	/*
	 * Methods:
	 * create
	 * add
	 * addAll
	 * addFirst()
	 * addLast()
	 * 
	 * remove/delete:
	 * remove(index)
	 * removeFirst()
	 * removeLast()
	 * 
	 * retrive / read:
	 * get(index)
	 * getFirst()
	 * getLast()
	 * 
	 * update:
	 * set(index , value)
	 * 
	 * isEmpty()
	 * contains()
	 * size()
	 * clear()
	 * clone()
	 * 
	 */
	
	public void arraylist()
	{
		//ArrayList<String> al = new ArrayList<>();
		//ArrayList<String> al1 = new ArrayList<>();
		List<String> al = new LinkedList<>();
		//LinkedList<String> al = new LinkedList<>();
		LinkedList<String> al1 = new LinkedList<>();
		System.out.println(al);
		System.out.println(al.isEmpty());
		
		al1.add("java");
		al1.add("python");
		System.out.println(al1);
		
		// add or create
		al.add("sathish");
		al.add("kumar");
		al.add("sathish");
		al.add("R");
		System.out.println(al);
		System.out.println(al.size());
		//update
		al.set(3, "B.tech");
		System.out.println(al);
		
		//delete
		/*al.remove(1);
		al.removeFirst();
		al.removeLast();*/
		
		System.out.println(al);
		
		//get or retrieve
		
		//1st tyep
		for(String each :al)
		{
			System.out.println(each);
		}
		
		if(al.contains("B.techs"))
		{
			System.out.println("Yrs its avaialable");
		}
		//2nd type
		
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		
		System.out.println("3rd type");
		//3rd type
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		// 4th type
		System.out.println("4th type");
		Iterator t1= al.iterator();
		while(t1.hasNext())
		{
			System.out.println(t1.next());
		}
		
		al.addAll(al1);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListConcetps L = new ListConcetps();
		L.arraylist();
	}

}
