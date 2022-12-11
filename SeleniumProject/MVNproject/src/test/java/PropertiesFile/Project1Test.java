package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Project1Test {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("My.properties");
		prop.load(fis);

		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("email"));
		System.out.println(prop.getProperty("password"));

	/*	prop.setProperty("name", "Kunal Wasnik");//writing in property file

		FileOutputStream fos = new FileOutputStream("My.properties");
		
		prop.store(fos,null);  */
	}
}
