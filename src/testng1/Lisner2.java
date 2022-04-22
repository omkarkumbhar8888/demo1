package testng1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Lisner2 extends PassFailSkip2 implements ITestListener {

	public void onTestFailure(ITestResult result) {

		TakesScreenshot src = (TakesScreenshot)driver;
		File source =src.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "\\Screenshot\\" + "failtest" + ".png";
		File destination = new File(path);
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
System.out.println("screenshot done");
		}

	}

	public void onStart(ITestContext context) {
		System.out.println("on start");
	}

	public void onFinish(ITestContext context) {
		System.out.println("finish");
	}

}
