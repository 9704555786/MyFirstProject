package DemoPro1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DayT6Test {
	
	@Test(dataProvider="getData")
	public void loginfuctionality(String username,String password) {
		System.out.println("user got login success fully :"+username+"and password:"+password);
	}
	@DataProvider
	public Object[][] getData(){
		Object[][]data =new Object[3][2];
		
		data[0][0]="Amol";
		data[0][1]="12345";
		
		data[1][0]="Rohan";
		data[1][1]="698710";
		
		data[2][0]="Shubham";
		data[2][1]="11121314";
		
		return data;
	}
}
