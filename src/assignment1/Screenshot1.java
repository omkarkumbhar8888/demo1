package assignment1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Screenshot1 {
	WebDriver driver;

	@BeforeClass
	public void bc() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		opt.addArguments("--start-maximized");//to maximized browser
		opt.addArguments("--disable-notifications");//to disable notifications
		opt.addArguments("--incognito");// to open in incognito
		opt.addArguments("--headless");//without open browser script get executed
		driver = new ChromeDriver(opt);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.facebook.com/");
	}

	@AfterClass()
	public void ac() {
		driver.quit();
	}

	@Test(alwaysRun = false)
	public void t() {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abcd12345");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("abcd@123");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		String actual =driver.findElement(By.xpath("//*[@class='_9ay7']")).getText();
		
		String expected = "The password that you've entered is incorrect. Forgotten password?";
		Assert.assertEquals(actual, expected);
		Reporter.log("test case passed");
	}

	@AfterMethod()
	public void am() throws IOException {
		TakesScreenshot src = (TakesScreenshot) driver;
		File source = src.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "\\Screenshot\\" + "screenshotd" + ".png";
		File destination = new File(path);
		org.openqa.selenium.io.FileHandler.copy(source, destination);
	}

}
