package AlertAllConcept;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BootStrap {
	 public static void main(String[]args){
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://automatenow.io/sandbox-automation-testing-practice-website/modals/");

	        driver.findElement(By.id("simpleModal")).click();
	        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pum_popup_title_1318")));
	        String titleOnModelDialog=driver.findElement(By.id("pum_popup_title_1318")).getText();
	        System.out.println(titleOnModelDialog);
	        driver.findElement(By.xpath("(//button[@aria-label='Close'])[2]")).click();
	    }
	}

