package Inheritance;

public class FitaBaseBranch {
	
	String baseBranchName = "FITA Annanagar";
	
	String[] Courses = {"Python","JAva","C#","SQL","Testing"};
	
	public boolean GetCourseExist(String CourseName)
	{
		
		for(String eachCourse : Courses)
		{
			if(eachCourse.equalsIgnoreCase(CourseName))
			{
				return true;
			}
		}
		return false;
	}
	
	public void CourseExistorNot(String courseName)
	{
		if(GetCourseExist(courseName) == true)
		{
			System.out.println("The requested course : "+courseName +" is available");
		}
		else
		{
			System.out.println("The requested course is not available");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FitaBaseBranch F = new FitaBaseBranch();
		F.CourseExistorNot("Selenium Testing ");
	}

}
