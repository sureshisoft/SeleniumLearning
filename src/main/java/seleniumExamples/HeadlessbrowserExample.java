package seleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessbrowserExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HtmlUnitDriver driver= new HtmlUnitDriver();
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver= new ChromeDriver()
		 */;
		driver.get("http://leafground.com/pages/checkbox.html");
		System.out.println(driver.getTitle());
		List<WebElement> lt=driver.findElements(By.xpath("//label[contains(text(),'Select all below checkboxes ')]/following::input"));
		System.out.println(lt.size());
		for(int i=0;i<lt.size();i++)
		{
			lt.get(i).click();
			
		}
		System.out.println(" Html unit driver program is executed sucessfully");
	}
	

	}


