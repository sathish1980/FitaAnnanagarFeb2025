package DataBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	
static String filePath= System.getProperty("user.dir")+"\\ENV\\DBConnections.properties";
	
	public static Properties readData() throws IOException
	{
		File F = new File(filePath);
		FileInputStream Fs = new FileInputStream(F);
		Properties P = new Properties();
		P.load(Fs);
		return P;
	}

}
