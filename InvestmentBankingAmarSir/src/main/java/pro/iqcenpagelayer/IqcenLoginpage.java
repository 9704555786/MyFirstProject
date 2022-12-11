package pro.iqcenpagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseTest;

public class IqcenLoginpage extends BaseTest {
	public IqcenLoginpage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	private WebElement cl_register;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement txtbox_emailfield;
	
	@FindBy(xpath = "//input[@type='password'])")
	private WebElement txtbox_pass;
	
	@FindBy (xpath = "//button")
	private WebElement button_click;
	
	public WebElement cl_register() {
		return cl_register;
	}
	public WebElement txtbox_emailfield() {
		return txtbox_emailfield;
	}
	public WebElement txtbox_pass() {
		return txtbox_pass;
	}
	public WebElement button_click() {
		return button_click;
	}
			
}
