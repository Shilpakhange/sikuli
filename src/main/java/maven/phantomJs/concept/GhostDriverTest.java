package maven.phantomJs.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class GhostDriverTest {

	public static void main(String[] args) {


		System.setProperty("phantomjs.binary.path", "C:\\Users\\Shilpa Khandge\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver=new PhantomJSDriver();
		driver.get("https://classic.crmpro.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("shilpaabc");
		driver.findElement(By.name("password")).sendKeys("Sh$ln9606");
		WebElement loginbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		loginbutton.click();
		System.out.println(driver.getTitle());

		
	}

}
