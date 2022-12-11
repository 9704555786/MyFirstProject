package DemoPro1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneTest {
	@Test
	public void mOne() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String TextName=driver.findElement(By.xpath("//h1")).getText();
		System.out.println(TextName);
	}
	
		
	
}
