package BasicsOfJava;

public class StringsConcepts {
	
	String name = "Sathish Kumar";
	String name1 = "Sathish kumar";
	
	public void stringcon()
	{
		 int count =0;
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		String lower= name.toLowerCase();
		System.out.println(name.toUpperCase());
		System.out.println(name.indexOf('a'));
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.charAt(11));
		System.out.println(name.compareTo(name1));
		System.out.println(name==name1);
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.contains(" ish"));
		System.out.println(name.substring(0,4));
		System.out.println(name.substring(1));
		System.out.println(name.startsWith("Sath"));
		System.out.println(name.endsWith("ar"));
		System.out.println(name+name1);
		System.out.println(name.concat(name1));
		System.out.println(name.isEmpty());
		System.out.println(name.replace("at", "AT"));
		System.out.println(name);
		System.out.println("*****");
		System.out.println(name.repeat(4));
		char[] value = name.toCharArray();// 'S','a','t','h','i'
		for(int i=0;i<value.length;i++)
		{
		System.out.println(value[i]);
		if(value[i]=='a' ||value[i]=='A')
		{
			count=count+1;
		}
		System.out.println(count);
		}
		
		/*StringBuilder newName = new StringBuilder("Sathish");
		System.out.println(newName);
		newName.append("Kumar");
		System.out.println(newName);
		newName.reverse();
		System.out.println(newName);//ramukhsihtaS*/
		
		StringBuffer newName = new StringBuffer("Sathish");
		System.out.println(newName);
		newName.append("Kumar");
		System.out.println(newName);
		newName.reverse();
		System.out.println(newName);//
		name ="FITA";	
		System.out.println(name);
		
		StringBuilder s1 = new StringBuilder("FitaAnnanagar");
		System.out.println(s1);
		s1.append("2024");
		System.out.println(s1);
		s1= new StringBuilder("NewCollege");
		System.out.println(s1);
		s1.replace(5,7,"sa");
		System.out.println(s1);
		System.out.println(s1.reverse());
		
	}
	
	public static void main(String[] args)
	{
		StringsConcepts s = new StringsConcepts();
		s.stringcon();
	}

}
