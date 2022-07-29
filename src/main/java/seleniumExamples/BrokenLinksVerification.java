package seleniumExamples;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksVerification {

	@Test
	public void getBrokenLinks() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<alllinks.size();i++)
		{
			String web=alllinks.get(i).getAttribute("href");
           URL url= new URL(web);
           
           HttpURLConnection con= (HttpURLConnection) url.openConnection();
           con.connect();
          int codeValue= con.getResponseCode();
          if(codeValue >= 400)
          {
        	  System.out.println("the broken links are :"+web);
          } 
        	  else
        	  {  
        		  System.out.println("the unbroken links are :"+web);
        		  
          }
		}
	}
	
}
