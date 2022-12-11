package SeleniumPack3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Point;

public class Point1 {
	public static void main (String [] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Payal\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Point p = new Point (417,513);
		driver.manage().window().setPosition(p);
		Point s = driver.manage().window().getPosition();
		System.out.println(s);
		
		driver.get("https://www.irctctourism.com/");
		
	}

}
