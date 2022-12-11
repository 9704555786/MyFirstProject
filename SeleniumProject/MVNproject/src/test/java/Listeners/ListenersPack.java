package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersPack implements ITestListener {
	
	public void OnTeststart(ITestResult result) {
		System.out.println("My name Amol kamble start test "+result.getName());
	}
	public void onFinish(ITestContext context) {
		System.out.println("Amol Kamble Test excecution Ended ");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println(" Amol Kamble Test Excecution Successfull "+result.getName());
	}
	public void onTestFailure(ITestResult result) {
		//take screen shot in this listener
		//updating failure report
		//updating log
		System.out.println("Test Excecution Fail "+result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Execution Skipped "+result.getName());
	}
}
