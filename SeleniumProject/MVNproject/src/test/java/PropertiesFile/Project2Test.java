package PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project2Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("My.properties");
		prop.load(fis);

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(prop.getProperty("URL2"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);

	
		driver.findElement(By.id("fullName")).sendKeys(prop.getProperty("fill"));
	}
}
