package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
	Actions act;

	@BeforeMethod
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	 act = new Actions(driver);

	}

	@Test
	public void m2() throws AWTException, InterruptedException {
		 act = new Actions(driver);
		driver.get("http://demo.automationtesting.in/Static.html");
		WebElement w1 = driver.findElement(By.xpath("//*[text()='SwitchTo']"));
		w1.click();
		act.contextClick(w1);
		Robot robo = new Robot();
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_ENTER);
		System.out.println("robo done");
		

	}

//	@AfterClass
//	public void m3() {
//		driver.quit();
//	}

}
