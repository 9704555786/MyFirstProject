package MouseCommad;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableDragDrop {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");
        WebElement frameElement = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);
        Actions actions=new Actions(driver);

        WebElement resizableOption = driver.findElement(By.cssSelector("div.ui-icon-gripsmall-diagonal-se"));
        actions.dragAndDropBy(resizableOption,100,150).perform();

    }

}

