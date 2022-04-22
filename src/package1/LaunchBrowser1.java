package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	
	
	
	
	
	
	
	
}
}
