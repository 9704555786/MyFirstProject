package pro.iqcentestlayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pro.iqcenpagelayer.IqcenLoginpage;
import pro.iqcenpagelayer.IqcenRegitrationpage;
import resources.BaseTest;

public class IqcenLoginTest extends BaseTest {




	@Test
	public void Register() throws InterruptedException {
		IqcenLoginpage Lo = new IqcenLoginpage();
		Lo.cl_register().click();

		IqcenRegitrationpage Re = new IqcenRegitrationpage();
		Thread.sleep(4000);
		Re.alert_coki.click();
		Re.txtbox_RegEmail.sendKeys("Amol747@gmail.com");
		Re.txtbox_RegPass.sendKeys("Amol@12345");
		Re.txtbox_RegFirstName.sendKeys("Amol");
		Re.txtbox_RegLastName.sendKeys("Kamble");
		Re.txtbox_RegPhone_no.sendKeys("8756945628");
		Re.dropdown_Drop.click();
		
		Thread.sleep(3000); /*
		WebElement dropdown = Re.visible_Text;
		Select select = new Select(dropdown);
		select.selectByVisibleText("EUR (Account currency)");                  */
		
		Re.visible_Text.click();
		Thread.sleep(2000);
		Re.checkbox_select.click();
		Re.submit_click.click();
	}

}
