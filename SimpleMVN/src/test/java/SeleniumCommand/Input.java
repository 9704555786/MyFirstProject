package SeleniumCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Input {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	/*	// Input section
		driver.findElement(By.linkText("Edit")).click(); 
		driver.findElement(By.id("fullName")).sendKeys("Amol Kamble");
		Thread.sleep(3000);
		driver.findElement(By.id("fullName")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("fullName")).sendKeys("Shubham more"); */
		// By WebElement
		driver.findElement(By.linkText("Edit")).click(); 
		WebElement textfilling = driver.findElement(By.id("fullName"));
		textfilling.sendKeys("Rohan poklekar");
		Thread.sleep(3000);
		textfilling.clear();
		Thread.sleep(2000);
		textfilling.sendKeys("keshari munne"); 
		
		//get text
		String text=driver.findElement(By.xpath("//li[normalize-space()='sendKeys()']")).getText();
		System.out.println(text);
		
		//getCurrentUrl()
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		//getAttribute()-when text label is not present
		String val=driver.findElement(By.id("getMe")).getAttribute("value");
		String val1=driver.findElement(By.id("getMe")).getAttribute("type");
		String val2=driver.findElement(By.id("getMe")).getAttribute("class");
		System.out.println(val +" "+ val1 +" "+ val2);
		
		//boolean = isEnabled(),isDisplayed(),isSelected()
		boolean Enablestatus=driver.findElement(By.id("noEdit")).isEnabled();
		if(Enablestatus) {
			System.out.println("button is Enable state");
		}else {
			System.out.println("button is Not Enable state");
		}
		
		//Navigate().to/.back()/.refresh()/.forward();
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.navigate().back();
		driver.navigate().to("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
		
		//getpagesources()
		String htmlcode=driver.getPageSource();
		System.out.println(htmlcode);     
		
		//getTagname()=just retrive tag name value & its String
		
		//getCssValue()
		String Style=driver.findElement(By.xpath("//img[@alt='letcode']")).getCssValue("line-height");
		System.out.println(Style);
		
		//Dimension=getsize()
		Dimension d=driver.findElement(By.id("dontwrite")).getSize();
		System.out.println(d.height);
		System.out.println(d.width);
		//getlocation=point
		Point p=driver.findElement(By.id("dontwrite")).getLocation();
		System.out.println(p.x);
		System.out.println(p.y);
		
		//getRect()=All in one
		
		Rectangle r=driver.findElement(By.id("dontwrite")).getRect();
		System.out.println(r.height);
		System.out.println(r.width);
		System.out.println(r.x);
		System.out.println(r.y);
		

		
	

	}

}
