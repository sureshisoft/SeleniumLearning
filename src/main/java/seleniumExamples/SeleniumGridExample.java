package seleniumExamples;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridExample {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("chrome");
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.3:4444"),cap);
		
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("Suresh");
		

		

	}

}
