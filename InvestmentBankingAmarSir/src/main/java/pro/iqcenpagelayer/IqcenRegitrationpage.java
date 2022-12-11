package pro.iqcenpagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseTest;

public class IqcenRegitrationpage extends BaseTest {
	
	public IqcenRegitrationpage() {
		PageFactory.initElements(driver,this);
	}
		@FindBy(xpath = "//span[@class='cookie__btn']")
		public WebElement alert_coki;
		 
		@FindBy(xpath = "//input[@type='email']")
		public WebElement txtbox_RegEmail;
		
		@FindBy (xpath = "//input[@type='password']")
		public WebElement txtbox_RegPass;
		
		@FindBy (xpath = "//input[@ng-model='user.firstName']")
		public WebElement txtbox_RegFirstName;
		
		@FindBy (xpath = "//input[@ng-model='user.lastName']")
		public WebElement txtbox_RegLastName;
		
		@FindBy (xpath = "//input[@placeholder='Phone number']")
		public WebElement txtbox_RegPhone_no;
		 
		@FindBy (xpath = "//div[@class='ui dropdown dynamic-vh drop-style ng-pristine ng-untouched ng-valid ng-not-empty selection']")
		public WebElement dropdown_Drop;
		
		@FindBy(xpath = "//div[normalize-space()='EUR (Account currency)']")
		public WebElement visible_Text;
		
		@FindBy (xpath  = "//div[@class='front']")
		public WebElement checkbox_select;
		
		@FindBy (xpath = "//div[@class='front']")
		public WebElement submit_click;
		
		public WebElement alert_coki() {
			return alert_coki;
		}
		
		public WebElement txtbox_RegPass() {
			return txtbox_RegPass;
		}
		public WebElement ttxtbox_RegFirstName() {
			return txtbox_RegFirstName;
		}
		public WebElement txtbox_RegLastName() {
			return txtbox_RegLastName;
		}
		public WebElement txtbox_RegPhone_no() {
			return txtbox_RegPhone_no;
		}
		public WebElement tdropdown_Drop() {
			return dropdown_Drop;
		}
		public WebElement visible_Text() {
			return visible_Text;
		}
		
		public WebElement checkbox_select() {
			return checkbox_select;
		}
		public WebElement submit_click() {
			return submit_click;
		}
}
	