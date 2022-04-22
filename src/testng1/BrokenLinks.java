package testng1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();

		option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		option.addArguments("--start-maximized");
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);

		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_1jyasdi57f_e&adgrpid=60456322738&hvpone=&hvptwo=&hvadid=486393568006&hvpos=&hvnetw=g&hvrand=9003425846888055941&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007786&hvtargid=kwd-295905178780&hydadcr=14451_2154369&gclid=Cj0KCQjw3v6SBhCsARIsACyrRAnH045-BV8Xoj3p8xmSjdtfoglB9zu0IhYJL3wC1-cjJmsmwKqdbYkaAgYKEALw_wcB");
		List<WebElement> w1 = driver.findElements(By.tagName("a"));
		int z = w1.size();
		System.out.println(z);
		int countbrlinks = 0;
		int countvalidlinks = 0;
		for (WebElement w2 : w1) {
			String url = w2.getAttribute("href");

			try {
				URL link = new URL(url);

				HttpURLConnection Httpcon = (HttpURLConnection) link.openConnection();
				Thread.sleep(10);
				Httpcon.connect();
				int statuscode = Httpcon.getResponseCode();
				if (statuscode >= 400) {
					System.out.println(url + "link is broken link");

					countbrlinks++;

				} else {
					// System.out.println(url + "link is not broken");
					countvalidlinks++;
				}

			} catch (Exception e) {

				System.out.println("you got exception");
			}

		}
		System.out.println("total link " + z);
		System.out.println("broken link" + countbrlinks);
		System.out.println("working link" + countvalidlinks);
	}

}
