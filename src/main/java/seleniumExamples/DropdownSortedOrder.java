package seleniumExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSortedOrder {
	
	@Test
	public void  getData()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		WebElement dpValues=driver.findElement(By.xpath("//select[@name='category_id']"));
		Select drop= new Select(dpValues);
	List<WebElement> lt=drop.getOptions();
	
	ArrayList OriginalList= new  ArrayList();
	ArrayList Templist= new ArrayList();
	
	for(WebElement ele:lt)
	{
		OriginalList.add(ele.getText());
		Templist.add(ele.getText());
	}
	System.out.println("Original List:"+ OriginalList);
	System.out.println("Temporary List:"+ Templist);
	Collections.sort(Templist);
		System.out.println("After sorting Temp list:"+Templist);
		
		if((OriginalList).equals(Templist))
		{
			System.out.println("Dropdown values are matched");
		}
		else
		{
			System.out.println("Dropdown values are not matched");
		}
		
	}

}
