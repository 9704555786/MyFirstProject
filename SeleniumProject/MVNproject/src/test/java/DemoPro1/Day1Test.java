package DemoPro1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1Test {
	public static void main (String[]args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Dialog")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("accept")).click();
		
		
		
		
	}

}
