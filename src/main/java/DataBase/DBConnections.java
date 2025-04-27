package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnections {
	
	public void Connections()
	{
		 Connection connection = null;
	        try {
	            // below two lines are used for connectivity.
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/FITAAnnanagar",
	                "root", "Admin@123");
	 
	            // mydb is database
	            // mydbuser is name of database
	            // mydbuser is password of database
	 
	            Statement statement;
	            statement = connection.createStatement();
	            statement.executeUpdate("INSERT INTO student VALUES(5, 'Ishaan Bhela', 'Intro to JDBC', 'Annanagar','chenaai','REACT');");
	            System.out.println("Insert seucessfull");
	            ResultSet resultSet;
	            resultSet = statement.executeQuery(
	                "select * from student");
	            int id;
	            String Lname;
	            String Fname;
	            String address;
	            String city;
	            String course;
	            
	            while (resultSet.next()) {
	                id = resultSet.getInt("StudentId");
	                Lname = resultSet.getString("lastName").trim();
	                Fname = resultSet.getString("FirstName").trim();
	                address = resultSet.getString("Address").trim();
	                city = resultSet.getString("City").trim();
	                course = resultSet.getString("Course").trim();
	               // System.out.println("Code : " + id
	                 //                  + " Lname : " + Lname + " Fname : " + Fname+ " address : " + address+ " city : " + city+ " course : " + course );
	                
	                System.out.println( id
                            + "\t" + Lname + "\t" + Fname+ "\t" + address+ "\t" + city+ "\t" + course );
	            }
	            statement.executeUpdate("Delete from student where studentId='3';");
	            System.out.println("delete sucessfull");
	            resultSet.close();
	            statement.close();
	            connection.close();
	        }
	        catch (Exception exception) {
	            System.out.println(exception);
	        }
	    } // function ends
	
	
	public void prepareStatement(int rollnumber,String lname,String fname,String address,String city,String course)
	{
		 Connection connection = null;
	        try {
	            // below two lines are used for connectivity.
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/FITAAnnanagar",
	                "root", "Admin@123");
	 
	            // mydb is database
	            // mydbuser is name of database
	            // mydbuser is password of database
	 
	            String query ="INSERT INTO student VALUES(?, ?, ?, ?,?,?);";
	            PreparedStatement  statement;
	            statement = connection.prepareStatement(query);
	            statement.setInt(1, rollnumber);
	            statement.setString(2, lname);
	            statement.setString(3, fname);
	            statement.setString(4, address);
	            statement.setString(5, city);
	            statement.setString(6, course);
	            int myRs = statement.executeUpdate();
	            //statement.executeUpdate("INSERT INTO student VALUES(5, 'Ishaan Bhela', 'Intro to JDBC', 'Annanagar','chenaai','REACT');");
	            System.out.println("Insert seucessfull");
	            
	            //resultSet.close();
	            statement.close();
	            connection.close();
	        }
	        catch (Exception exception) {
	            System.out.println(exception);
	        }
	    } // function ends
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnections DB =new DBConnections();
		DB.prepareStatement(6,"D","sathish","avadi","chennai","SQL");
		DB.prepareStatement(7,"E","kumar","avadi","chennai","Testing");
	}

}
