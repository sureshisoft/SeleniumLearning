package seleniumExamples;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import javaExamples.Hashmap;

public class DownloadFile {
	
	@Test
	public void getDownload() throws InterruptedException
	
		{
		//String Location ="D:\\Screenshot";
			
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("download.default_directory", "D:\\Screenshot");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("File Download")).click();
		driver.findElement(By.linkText("TextDoc.txt")).click();
	    File Loc= new File("D:\\Screenshot");
	    Thread.sleep(10000);
	    
	    //collecting all the files 
	    
	    
	File[] Allfiles= Loc.listFiles();
	
	     //checking the download file path
	
	 for(File f: Allfiles)
	 {
		 System.out.println(f.getName());
		 if(f.getName().equals("TextDoc.txt"))
		 {
		  System.out.println("File is avaiable in machine");
		 break;
		 }
		 
	 }
	
	}
}
		
	


