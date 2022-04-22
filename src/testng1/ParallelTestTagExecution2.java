package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestTagExecution2 {

	@Parameters("a1")
	@Test
	public void m3(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	@Parameters("b1")
	@Test
	public void m4(String build) {
		System.out.println(build);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
