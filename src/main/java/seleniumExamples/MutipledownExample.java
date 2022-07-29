package seleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutipledownExample {
	
	@Test
	public void getDropDownExample()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	WebElement first=driver.findElement(By.xpath("//select[@id='first']"));
	/*Select prod = new Select(first);
	prod.selectByVisibleText("Google");*/
	
	selectData(first,"Google");
	
	WebElement second=driver.findElement(By.xpath("//select[@id='animals']"));
	//Select animal = new Select(second);
//	animal.selectByVisibleText("Avatar");
	selectData(second,"Avatar");
	
	}
	
	
	//list
	
	public void selectData(WebElement selectElement, String value)
	{
		
	Select opt=new Select(selectElement);
	
	List<WebElement> lt= opt.getOptions();
	
	for(WebElement ele: lt)
	{
		if(ele.getText().equals(value))
		break;	
	}
	
	}

}
