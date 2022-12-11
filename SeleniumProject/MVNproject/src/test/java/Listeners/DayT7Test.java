package Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DayT7Test {// listener
	@Test
	public void ClassSeven() {
		int a = 1;
		int b = 5, c = 6;
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		if (a == 1) {
			Assert.assertTrue(b < c);
		} else if (a == 2) {
			Assert.assertTrue(b > c);
		} else if (a == 3) {
			throw new TestNGException("");
		}
	}
}
