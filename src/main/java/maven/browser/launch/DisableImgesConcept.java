package maven.browser.launch;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableImgesConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shilpa Khandge\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addEncodedExtensions("Block-image_v1.1.crx");
		//disableImg(option);		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());

	}

	public static void disableImg(ChromeOptions option)
	{

//		HashMap<String,Object> imges=new HashMap<String,Object>();
//		imges.put("images", 2);
//		HashMap<String,Object>pref=new HashMap<String, Object>();
//		pref.put("profile.default_content_setting_values",imges);
//		option.getExperimentalOption("prefs");
		
		
	}
}
