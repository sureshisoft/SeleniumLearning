package seleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateHandlerExample {
	
	@Test
	public void getHandler() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		String year= "2022";
		String month="Aug";
		String date="25";
				
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Salem",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("chennai",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		
		while(true)
			{
		
		//Get the month and Date 
		
		
		  String  text=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		  System.out.println(text);
		 
		  String arr[]=text.split("");
		  String mon= arr[0];
		  String yea=arr[1];
		
		  if(mon.equalsIgnoreCase(month) && yea.equalsIgnoreCase(year))
		  break;
		  else
			  driver.findElement(By.xpath("//td[@class='next']")).click();
			  break;
			} 
		//date selection 
		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		
		for(WebElement corDate: allDates)
		{
			String redBusDate=corDate.getText();
			if(redBusDate.equals(date))
					{
				corDate.click();
					}
		}
		
	}

}
