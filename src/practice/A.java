package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class A {

	WebDriver driver;
	Actions act;

	@BeforeMethod
	public void bm() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		act = new Actions(driver);
	}

	public void m2() {
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement w1 = driver.findElement(By.xpath("//*[@placeholder='First Name']"));

	//	act.sendKeys(w1, "good").sendKeys(Keys.TAB).sendKeys("night").sendKeys(Keys.TAB).sendKeys("pune")
	//			.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).sendKeys(Keys.TAB)
	//			.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).sendKeys("@gmail.com").sendKeys(Keys.TAB)
	//			.sendKeys("1234567890").build().perform();

		WebElement w2 = driver.findElement(By.xpath("(//*[@name='radiooptions'])[1]"));
		act.moveToElement(w2).click().build().perform();
	}

	public void m3() {

		driver.findElement(By.xpath("//*[@id='msdd']")).click();

		List<WebElement> w3 = driver.findElements(By.xpath("//*[@class='ui-corner-all']"));

//		for (WebElement w4 : w3) {
//			String a = w4.getText();
//			if (a.equals("English")) {
//				w4.click();
//			}
//		}
//		
		// if we want to first print data in dropdown and then select webelement
		for (WebElement w5 : w3) {
			String b = w5.getText();
			System.out.println(b);
		}
		for (WebElement w6 : w3) {
			String c = w6.getText();
			if (c.equals("Hindi")) {
				w6.click();

			}
		}
	}

	public void m4() {

		WebElement w6 = driver.findElement(By.xpath("//*[@id='Skills']"));
		Select sel = new Select(w6);
		List<WebElement> w7 = sel.getOptions();
		// we want to print data in dropdown and then select webelement
		for (WebElement w8 : w7) {
			String d = w8.getText();
			System.out.println(d);
		}

		sel.selectByIndex(5);

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
