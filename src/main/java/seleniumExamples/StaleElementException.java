package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://ui.freecrm.com/");
		WebElement usname=driver.findElement(By.xpath("//input[@placeholder='E-mail address']"));
		usname.sendKeys("suresh@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("bond");
		driver.navigate().refresh();
		usname.sendKeys("suresh@gmail.com");
		System.out.println("Suresh");
		
	}

}
