package SeleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriver1 {
public static void main (String []args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Payal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.irctctourism.com/");
	Thread.sleep(2000);
	driver.get("https://www.flipkart.com/");
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	driver.navigate().refresh();
	
	
	
}
}
