package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {

	@Test
	public void m1() {
		System.out.println("a");
		System.out.println("b");
		int i = 10;
		int j = 20;
		boolean k = i > j;
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(k);

		System.out.println("c");
		System.out.println("d");
		soft.assertAll();

	}

	@Test
	public void m2() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String actualmessage = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();

		String expectedmessage = "Account disabled";
		SoftAssert soft = new SoftAssert();

		soft.assertEquals(actualmessage, expectedmessage);
		System.out.println("comparision done ");
		soft.assertAll();
		System.out.println("handle by soft assert");

	}

}
