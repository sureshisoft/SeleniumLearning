package seleniumExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsExample {
	
	@Test
	public void waitExamp()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		//impilicty wait
		//For all the Weblements in Webpage by default 10 seconds should be displayed
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement ele=	driver.findElement(By.xpath("//img[@alt='Frame']"));
	
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	ele.click();
	}

}
