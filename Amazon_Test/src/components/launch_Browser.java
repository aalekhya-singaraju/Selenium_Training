package components;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import framework.BaseTest;


public class launch_Browser extends BaseTest {

	public static void run()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.skype.com/en/");

	}

}
