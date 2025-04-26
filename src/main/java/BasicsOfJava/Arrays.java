package BasicsOfJava;

import java.util.Scanner;

public class Arrays {
	String name ="FITA";
	
	String[] course = {"Java","Python","C#","SQL","AWS"};
	
	String[] items = new String[4];
	
	String[][] al = new String[4][1];
	
	String[][] alphabets = {{"A","B","C","K"},
							{"D","E","F","L"},
							{"G","H","I","M"}};
	
	
	
	public void PrintCourse()
	{
		System.out.println(name);
		System.out.println(course.length);
		//items[0]="Boost";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your item name: ");
		items[0]= s.next();
		System.out.println("Enter your 2nd item name: ");
		items[3]=s.next();
		
		for(int i=0;i<items.length;i++)
		{
			System.out.println(items[i]);
		}
		/*System.out.println(course[0]);
		System.out.println(course[1]);
		System.out.println(course[2]);
		System.out.println(course[3]);*/
		
		//System.out.println(alphabets[0][0]);
		//System.out.println(alphabets[1][1]);
		
		// to iterate row
		for(int i=0;i<alphabets.length;i++)
		{
			// to iterate column
			for(int j=0;j<alphabets[i].length;j++)
			{
				System.out.print(alphabets[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays A = new Arrays();
		A.PrintCourse();
	}

}
