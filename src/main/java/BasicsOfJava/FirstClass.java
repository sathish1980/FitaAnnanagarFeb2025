package BasicsOfJava;

import java.util.Scanner;

// accessmodifier class classname{}
public class FirstClass {

	public static void main(String[] args)
	{
		System.out.println("FITA");
		System.out.println("%%^^$Anna nagar@$#%$%");
		System.out.println("Core java");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your coursename : ");
		String coursename = s.next();
		String coursename1 = s.next();
		System.out.println("Your selected course is : " + coursename);
		System.out.println("Your selected course is : " + coursename1);
		System.out.println("Your selected course is : " + s.next());
		System.out.println("Your selected course is : " + coursename);
		int age =s.nextInt();
		double amount = s.nextDouble();
		s.close();
		
	}
}
