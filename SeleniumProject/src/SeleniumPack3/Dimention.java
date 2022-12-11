package SeleniumPack3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;

public class Dimention {
	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Payal\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Dimension d = new Dimension (700,500); // dimension to open window
		driver.manage().window().setSize(d);
	//	driver.manage().window().getSize();
		
		Dimension size = driver.manage().window().getSize();
		System.out.println("My Browser window size is:  " +size);
		
		driver.get("https://www.irctctourism.com/");
		
		Thread.sleep(2000);
	}

}
