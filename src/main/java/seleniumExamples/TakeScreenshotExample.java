package seleniumExamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotExample {
	
	@Test
	public void getScreen() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	
	/*
	 * TakesScreenshot ts= (TakesScreenshot) driver; File
	 * src=ts.getScreenshotAs(OutputType.FILE); File tgt = new
	 * File("D:\\Screenshot\\test.jpg"); FileUtils.copyFile(src, tgt);
	 */
	
	//capturing for Particular section 
	
	WebElement section= driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
	  File source= section.getScreenshotAs(OutputType.FILE);
	  File target= new File ("D:\\Screenshot\\section.jpg");
	  FileUtils.copyFile(source, target);
	}

}
