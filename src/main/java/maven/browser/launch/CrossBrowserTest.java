package maven.browser.launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {

	public static void main(String[] args) {
		WebDriver driver;
		if (Constants.browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Shilpa Khandge\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");

			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.MICROSECONDS);

		}
		else if(Constants.browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Shilpa Khandge\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		}

	}


}
