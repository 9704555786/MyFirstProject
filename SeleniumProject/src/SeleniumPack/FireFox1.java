package SeleniumPack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FireFox1 {
public static void main(String [] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Payal\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver(); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.irctctourism.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in");
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	driver.navigate().refresh();
}
}
