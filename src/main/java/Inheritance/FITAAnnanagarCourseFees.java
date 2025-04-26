package Inheritance;

public class FITAAnnanagarCourseFees extends FitaAnnanagar{
	
	String[] CourseFees = {"Python-20000","JAva-15000","C#-25000","SQL-10000","Testing-15000"};

	public String GetFees(String courseName)
	{
	
		for(String eachCourseFees: CourseFees)
		{
			String[] eachCourseFeesSplit = eachCourseFees.split("-");
			if(courseName.equalsIgnoreCase(eachCourseFeesSplit[0])) {
				return eachCourseFeesSplit[1];
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FITAAnnanagarCourseFees F = new FITAAnnanagarCourseFees();
		String course = "SQL";
		F.CourseExistorNot(course);
		if(F.GetCourseExist(course))
		{
		System.out.println(F.GetFees(course));
		}
	}

}
