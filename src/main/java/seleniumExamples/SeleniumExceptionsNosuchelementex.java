package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumExceptionsNosuchelementex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/pages/Button.html");
		
		//No such element Execption if we wrong selector value say for home is correct we have mention id as homes
		driver.findElement(By.id("homes")).click();
		
	}

}
