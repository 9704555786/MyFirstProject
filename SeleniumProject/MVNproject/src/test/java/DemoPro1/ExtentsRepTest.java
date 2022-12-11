package DemoPro1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentsRepTest {// extentsReport
	WebDriver driver;
	ExtentReports extent;

	@BeforeMethod
	public void Configuration() {
		String reportPath = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
		reporter.config().setReportName("NAVIN AUTO");
		reporter.config().setDocumentTitle("NAVIN AUTOMATON TESTING");

		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Operating System", "Windows 11");
		extent.setSystemInfo("Tested By", "Amol Kamble");
	}

	@Test
	public void OneTest() {
		ExtentTest eTest = extent.createTest("Test Created POITest");

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		eTest.info("Ege Browser");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		eTest.info("Navigate To application");
		String writtentest = driver
				.findElement(By.xpath("//p[text()='If you already have an account with us, please login at the ']"))
				.getText();
		System.out.println(writtentest);
		if (writtentest.equals("If you already have an account with us, please login at the login page.")) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
	}
	@AfterMethod
	public void closingreport() {
		driver.close();
		extent.flush();
	}

}
