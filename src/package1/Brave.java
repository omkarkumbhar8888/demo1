package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Brave {

	static WebDriver driver;

	public static void m1() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();

		option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		option.addArguments("--start-maximized");
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");
	//	option.addArguments("headless");
		driver = new ChromeDriver(option);

		driver.get("https://www.google.co.in/");

	}

	public static void main(String[] args) {

		m1();

	}

}
