package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionExamples {
	
	@Test
	public void getRightClick()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/*
		 * driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		 * WebElement
		 * ele=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"))
		 * ; Actions act =new Actions(driver); act.contextClick(ele).build().perform();
		 */
		//
		
		driver.get("https://leafground.com/pages/drop.html");
		WebElement firstElement=driver.findElement(By.id("draggable"));
		WebElement secondElement=driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(firstElement, secondElement).build().perform();
		
	}

}
