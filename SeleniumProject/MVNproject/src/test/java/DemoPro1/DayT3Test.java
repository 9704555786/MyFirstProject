package DemoPro1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DayT3Test {
	// Order Of Execution And Anotation
	@BeforeTest
	public void Rohan() {
		System.out.println("*****Rohan******");
	}
	@AfterTest
	public void Shubham() {
		System.out.println("*****Shubham******");
	}

	@AfterMethod
	public void EndProgram() {
		System.out.println("Method end After every Execution");
	}

	@BeforeMethod
	public void StartProgram() {
		System.out.println("Start and open Browser every method");
	}

	@Test(priority = 1)
	public void testRegistration() {
		System.out.println("Registration test got executed");
	}

	@Test(priority = 2)
	public void testLogin() {
		System.out.println("Login test got executed");
	}

	@Test(priority = 3)
	public void testHomepage() {
		System.out.println("Home page test got executed");
	}
}
