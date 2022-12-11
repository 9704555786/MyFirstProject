package SeleniumPack2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GlobalizationImplementation implements Globalization{
				
		static WebDriver d;// WebDriver driver =new ChromeDriver();
		public void Chrome() {
			System.setProperty("k1","v1" );
			d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.get(URL1);
		}
		public void Edge() {
			System.setProperty("k2","v2");
			d = new EdgeDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.get(URL2);
			
		}
		public void Firefox() {
			System.setProperty("k3",v3);
			d = new FirefoxDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.get(URL3);
}
}
