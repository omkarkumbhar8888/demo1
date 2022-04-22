package practice;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandle1 {
	WebDriver driver;

	@BeforeMethod
	public void bm() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	@Test
	public void t() {
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
		WebElement w1 = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
		w1.click();

		String pid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		System.out.println(pid);
		System.out.println(allid);
		int a = allid.size();
		String[] ar = new String[a];
		int i = 0;
		for (String s : allid) {
			ar[i] = s;
			i++;
		}
		driver.switchTo().window(ar[1]);
		driver.findElement(By.xpath("//*[text()='Downloads']")).click();

	}

	@Test
	public void t1() {
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
		WebElement w1 = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
		w1.click();

		String pid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		System.out.println(pid);
		System.out.println(allid);

		for (String s : allid) {
			if (!(s.equals(pid))) {
				driver.switchTo().window(s);
				driver.findElement(By.xpath("//*[text()='Downloads']")).click();
			}
		}
	}


}
