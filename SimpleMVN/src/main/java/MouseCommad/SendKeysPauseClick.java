package MouseCommad;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SendKeysPauseClick {
    public static void main(String[]args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://www.tutorialsninja.com/demo/index.php?route=account/register");
        Thread.sleep(2000);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        String textOnAlert=alert.getText();
                System.out.println(textOnAlert);
                alert.accept();
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Amol");
       Actions actions=new Actions(driver);
        actions.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
                .sendKeys("Kamble")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("amolkamble@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("1234567890")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
                .sendKeys("12345")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
                .sendKeys("12345")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2)).sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER)
                .build().perform();      
    }
}

