package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		Dimension d = new Dimension(500, 300);
		driver.manage().window().setSize(d);

		Thread.sleep(5000);

		Point p = new Point(200, 10);
		driver.manage().window().setPosition(p);

	}
}
