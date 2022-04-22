package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PassFailSkip2 {

	static WebDriver driver;

	@Test
	public void fail() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php");

		WebElement w1 = driver.findElement(By.xpath("//input[@id='txtUsername']"));

		w1.sendKeys("Admine");

		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		WebElement w2 = driver.findElement(By.xpath("//*[text()='Invalid credentials']"));
		String actual = w2.getText();
		String expected = "Invalidd credentials";

		Assert.assertEquals(actual, expected);

	}

}
