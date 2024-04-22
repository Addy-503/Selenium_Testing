import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Testing {
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String actual_title=driver.getTitle();
		String expected_Title="Software Testing & Selenium Training in Bangalore | KRN Informatix";
		if (expected_Title.equals(actual_title)) {
			System.out.println("Test is passed");
			
		}else {
			System.out.println("Test Failed");
		}
		
	}

}
