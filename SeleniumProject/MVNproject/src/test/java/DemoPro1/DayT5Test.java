package DemoPro1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DayT5Test {//parameterization concept
		@Parameters({"URL"})
		@Test
		public void testOneA(String url) throws InterruptedException {
			System.out.println("Test method One start to execute");
			WebDriverManager.edgedriver().setup();
			WebDriver driver =new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Thread.sleep(2000);
			driver.close();
		}
		@Parameters({"URL"})
		@Test
		public void testTwoB(String url1) throws InterruptedException {
			System.out.println("Test method Two start to execute");
		
			WebDriverManager.edgedriver().setup();
			WebDriver driver =new EdgeDriver();
			driver.get(url1);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Thread.sleep(2000);
			driver.close();
		}
		@Parameters({"URLx"})
		@Test
		public void testThreeC(String url2) throws InterruptedException {
			System.out.println("Test method Three start to execute");
		
			WebDriverManager.edgedriver().setup();
			WebDriver driver =new EdgeDriver();
			driver.get(url2);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Thread.sleep(2000);
			driver.close();
		}
		@Test
		public void testFourD() {
			System.out.println("Test method one start to execute");
		}
		@Test
		public void testFiveE() {
			System.out.println("Test method one start to execute");
		}
		
}
