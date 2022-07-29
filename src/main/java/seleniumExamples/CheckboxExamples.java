package seleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxExamples {

	@Test
	public void getCheckBox()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		List<WebElement> lt=driver.findElements(By.xpath("//label[contains(text(),'Select all below checkboxes ')]/following::input"));
		
		for(int i=0;i<lt.size();i++)
		{
			lt.get(i).click();
			
		}
		
	}
}
