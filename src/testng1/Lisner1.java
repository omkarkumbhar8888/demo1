package testng1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Lisner1 implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess method name=" + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure method name=" + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped method name=" + result.getName());
	}

	public void onStart(ITestContext context) {
		System.out.println("onStart");
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
	}

}
