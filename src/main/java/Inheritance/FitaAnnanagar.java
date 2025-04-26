package Inheritance;

public class FitaAnnanagar extends FitaBaseBranch{
	static FITAAnnanagarCourseFees f1 = new FITAAnnanagarCourseFees();
	
	
	public void CourseExistOrnot(String courseName)
	{
		if(GetCourseExist(courseName)==true)
		{
			System.out.println("Course exist");
		}
		else
		{
			System.out.println("Course doesnot exist");
		}
		f1.GetFees("SQL");
	}

	
	public static void main(String[] args)
	{
		FitaAnnanagar F = new FitaAnnanagar();
		F.CourseExistorNot("SQL");
		f1.GetFees("SQL");
		System.out.println(F.baseBranchName);
	}
}
