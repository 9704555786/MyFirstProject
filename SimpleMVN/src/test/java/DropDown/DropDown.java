package DropDown;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/dropdowns");
        By fruits = By.id("fruits");
        By languages = By.id("lang");
        By hero = By.id("superheros");

        selectOptionInDropDownFiled(fruits,"visibleText","Mango");
        selectOptionInDropDownFiled(languages,"index","2");
        selectOptionInDropDownFiled(hero,"value","gr");
    }
    public static WebElement getWebElement(By field) {

        return driver.findElement(field);
    }
    public static void selectOptionInDropDownFiled(By field, String optionType, String optionValue) {
        Select select = new Select(getWebElement(field));
        switch ((optionType)) {
            case "visibleText":
                select.selectByVisibleText(optionValue);
                break;
            case "index":
                select.selectByIndex(Integer.parseInt(optionValue));
                break;
            case "value":
                select.selectByValue(optionValue);
                break;
        }
    }
}


