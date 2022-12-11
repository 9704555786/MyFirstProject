package SeleniumPack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;;
public class Egde {
public static void main(String []args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver","\"C:\\JarFile Eclipse\\edgedriver_win64\\msedgedriver.exe\"");
	
	WebDriver driver = new EdgeDriver();
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
