package MouseCommad;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryRightClick {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions actions=new Actions(driver);
        actions.contextClick(rightClick).perform();

        WebElement clickoption = driver.findElement(By.xpath("//span[text()='Quit']"));

        actions.click(clickoption).perform();

    }
}

