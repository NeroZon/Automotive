package propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propfile1212 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filepath = System.getProperty("user.dir");
		String configfile = "configfilefolder26-07-2022/datafile.properties";
		String complitpath = filepath+"\\"+configfile;
		File file = new File(complitpath);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("Driver"));
		
		
	

	}

}
