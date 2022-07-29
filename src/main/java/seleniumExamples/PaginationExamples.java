package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationExamples {
	
	@Test
	public void getPageData() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.findElement(By.name("username")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[contains(text(),'Sales')])[1]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Orders')])[1]")).click();
		driver.manage().window().maximize();
		
		//ChromeOptions o = new ChromeOptions();
	//	o.addArguments("--disable-notifications");
	//	driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		
		//table
		
		//find Total number of Pages
		
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(text);
		
		int totalPages=Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		System.out.println("total number of Pages:"+totalPages);
		
		for(int i=0;i<=totalPages;i++)
		{
		WebElement pageNumber=	driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
		String Page=pageNumber.getText();
		pageNumber.click();
		
		int totRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
		System.out.println("The total number of rows:"+ totRows);
		
		String pageNo= Integer.toString(i+1);
		
		
		
		}
	}

}
