package seleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
	
	@Test
	public void getTable()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//img[@alt='Table']")).click();
	//List<WebElement> allRows=driver.findElements(By.xpath("//div[@id='contentblock']//section/div//tbody//tr"));
	/*String firstRowvalue=allRows.get(1).getText();
	 System.out.println(firstRowvalue);
	  if(firstRowvalue.contains("Learn Locators 100% "))
			  {
		  
		  
			  }
	}*/

	   String beforeXpath="//div[@id='contentblock']//section/div//tbody//tr[";
	   String afterXpath="]//td[1]";
	   
	   for(int i=2;i<=6;i++)
	   {
		String text=  driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
		System.out.println(text);   
		if(text.contains("Handle Exceptions"))
		{
			driver.findElement(By.xpath("//div[@id='contentblock']//section/div//tbody//tr["+i+"]//td[1]/following::input[\"+i+\"]")).click();
		}
	   }
	
	}	
	
}
	
		
	  