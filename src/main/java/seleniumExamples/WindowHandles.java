package seleniumExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	
	@Test
	public void getWindow()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//h5[contains(text(),'Window')]")).click();
		driver.findElement(By.id("home")).click();
		Set<String> mulWindows=driver.getWindowHandles();
		System.out.println(mulWindows);
		List<String> lt= new ArrayList<String>(mulWindows);
		driver.switchTo().window(lt.get(1));
		System.out.println(driver.getTitle());
		driver.close();
	}

}
