package SeleniumPack2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public interface Globalization {//Globalization means uses of All oops concept
	
	static String k1 = "webdriver.chrome.driver";
	static String v1 = "C:\\Users\\Payal\\Downloads\\chromedriver_win32\\chromedriver.exe";
	
	static String k2 = "webdriver.edge.driver";
	static String v2 = "C:\\Users\\Payal\\Downloads\\edgedriver_win64\\msedgedriver.exe";
	
	static String k3 = "webdriver.gecko.driver";
	static String v3 = "C:\\Users\\Payal\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe";
	
	static String URL1 = "https://www.irctctourism.com/";
	static String URL2 = "https://www.amazon.in/";
	static String URL3 = "https://www.emirates.com/";
	
	public  void Chrome();
	public  void Edge();
	public  void Firefox();

}
