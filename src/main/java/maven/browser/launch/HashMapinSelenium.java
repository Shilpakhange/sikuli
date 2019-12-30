package maven.browser.launch;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapinSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Shilpa Khandge\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get("https://classic.crmpro.com");
		System.out.println(getCredentials());
		System.out.println(getCredentials().get("Admin"));
		String creden=getCredentials().get("Admin");
		String credential[]=creden.split(":");
		driver.findElement(By.name("username")).sendKeys(credential[0]);
		driver.findElement(By.name("password")).sendKeys(credential[1]);
		WebElement loginbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].click()", loginbutton);

		
	}

	public static HashMap<String, String> getCredentials() {
		HashMap<String, String> Usermap = new HashMap<String, String>();
		Usermap.put("customer", "cust:cust123");
		Usermap.put("Admin", "admin:admin123");
		Usermap.put("seller", "seles:sales123");
		Usermap.put("Inventory", "inve:inven123");
		return Usermap;
	}
}
