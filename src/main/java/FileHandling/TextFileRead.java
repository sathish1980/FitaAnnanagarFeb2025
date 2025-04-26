package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class TextFileRead {
	
	//String filePath= "C:\\Users\\DELL\\eclipse-workspace\\FitaAnnanagarFeb2025\\Input\\sample.txt";
	
	String filePath= System.getProperty("user.dir")+"\\Input\\sample.txt";
	public void readTextfile() throws IOException, InterruptedException
	{
		File F = new File(filePath);
		FileInputStream Fs = new FileInputStream(F);
		
		//System.out.print((char)Fs.read());
		//System.out.print((char)Fs.read());
		int i;
		while((i=Fs.read())!=-1)
		{
		System.out.print((char)i);
		Thread.sleep(500);
		}
		
		Fs.close();
		
	}
	
	public void readTextfilebyline() throws IOException, InterruptedException
	{
		File F = new File(filePath);
		FileReader Fs = new FileReader(F);
		BufferedReader B = new BufferedReader(Fs);
		//System.out.println(B.readLine());
		//System.out.println(B.readLine());
		//System.out.print((char)Fs.read());
		String i ;
		while((i=B.readLine())!=null)
		{
		System.out.println(i);
		i=i.toLowerCase();
		if(i.contains("sathish"))
		{
			System.out.println("Yes Sathish is avaialable");
		}
		Thread.sleep(500);
		}
		
		Fs.close();
		
	}
	

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		TextFileRead T = new TextFileRead();
		T.readTextfilebyline();
	}

}
