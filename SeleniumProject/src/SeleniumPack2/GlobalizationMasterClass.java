package SeleniumPack2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GlobalizationMasterClass {
	//static WebDriver driver;
	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Payal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver","C:\\Users\\Payal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Payal\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new EdgeDriver();
		//WebDriver driver2 = new FirefoxDriver();
		/* driver1.get("https://www.irctctourism.com/");
		Thread.sleep(5000);
		driver2.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver3.get("https://www.emirates.com/");  */
		
		 GlobalizationImplementation r = new  GlobalizationImplementation ();
		 
		 r.Chrome();
			Thread.sleep(5000);
		 r.Edge();
			Thread.sleep(5000);
		 r.Firefox();
	}

}
