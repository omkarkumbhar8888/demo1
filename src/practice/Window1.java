package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window1 {

	@Test
	public void m2() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

//		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
//		username.sendKeys("Admin");
//
//		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String a = driver.getWindowHandle();
		
		WebElement w1 =driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		w1.click();
		w1.click();
		w1.click();
		Set<String> b = driver.getWindowHandles();
		System.out.println(a);
		System.out.println(b);
		
			int noofid = b.size();
		String [] winid = new String[noofid];
		int i=0;
		for(String c :b) {
			winid[i]=c;
			i++;
			
		}
		driver.switchTo().window(winid[2]);
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		
		driver.switchTo().window(winid[3]);
		driver.get("https://groww.in/");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
