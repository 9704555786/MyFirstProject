package SeleniumPack3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Equal {
	
	String expurl = "https://www.emirates.com/in/english/";
	WebDriver driver;
	public void method1() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Payal\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.emirates.com/");
		
		String acturl = driver.getCurrentUrl();
		
		System.out.println(acturl);
		
		if(expurl.equals(acturl)) {
			System.out.println("Give URL same as actual and expected : " +acturl);
		}else {
			System.out.println(" Not match "  +expurl);
		}
		
		}
	public static void main (String [] args) {
		Equal r = new Equal();
		r.method1();
	}
}
