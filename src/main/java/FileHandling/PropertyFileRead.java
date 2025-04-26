package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileRead {
	
	String filePath= "C:\\Users\\DELL\\eclipse-workspace\\FitaAnnanagarFeb2025\\Input\\ENV.properties";
	
	public void readData() throws IOException
	{
		File F = new File(filePath);
		FileInputStream Fs = new FileInputStream(F);
		Properties P = new Properties();
		P.load(Fs);
		
	System.out.println(P.getProperty("username"));
	String url = P.getProperty("url");
	System.out.println(url);
	String ae = P.getProperty("age");
	
	int b=10;
	String c1= ae+b;
	System.out.println("String value : "+ c1);
	
	int newAge = Integer.parseInt(ae);
	int c =newAge+b;
	System.out.println("Integer value : "+ c);
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertyFileRead P = new PropertyFileRead();
		P.readData();
	}

}
