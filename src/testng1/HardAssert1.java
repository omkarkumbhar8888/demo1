package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HardAssert1 {

	@Test
	public void m1() {
		System.out.println("a");
		System.out.println("b");

		int i = 10;
		int j = 20;
		boolean k = i > j;
		Assert.assertTrue(k);// fail

		System.out.println("c");
		System.out.println("d");

	}

	@Test
	public void m2() {
		System.out.println("a");
		System.out.println("b");

		int i = 10;
		int j = 20;
		boolean k = i < j;
		Assert.assertTrue(true);// pass

		System.out.println("c");
		System.out.println("d");
		Assert.assertTrue(k);// fail
	}

	@Test
	public void m3() {
		System.out.println("a");
		System.out.println("b");

		int i = 10;
		int j = 20;
		boolean k = i < j;
		Assert.assertTrue(true);// pass

		System.out.println("c");
		System.out.println("d");
		Assert.assertTrue(k);// pass
	}

	@Test
	public void m4() {
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

		Assert.assertEquals(actualmessage, expectedmessage);
		System.out.println("comparision done ");

	}

	@Test
	public void m5() {
		Assert.fail("if we want to fail");
	}

	@Test(enabled = false)//if we want to skip testcase
	public void m6() {

		int x = 10;
		int y = 20;
		boolean z = x > y;

		Assert.assertFalse(z);

	}

}
