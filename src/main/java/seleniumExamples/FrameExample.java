package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameExample {
	
	@Test
	public void getFrame() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//img[@alt='Frame']")).click();
		WebElement ele=driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		
		
		
		
	}

}
