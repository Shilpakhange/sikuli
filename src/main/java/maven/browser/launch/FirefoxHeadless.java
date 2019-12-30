package maven.browser.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadless {

	public static void main(String[] args) {
		FirefoxBinary FB = new FirefoxBinary();
		FB.addCommandLineOptions("--headless");

		FirefoxOptions Fo = new FirefoxOptions();
		Fo.setBinary(FB);
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Shilpa Khandge\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver(Fo);
		driver.get("http://www.facebook.com");
	}
	

}
