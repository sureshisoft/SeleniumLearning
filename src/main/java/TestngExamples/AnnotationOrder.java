package TestngExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationOrder {
	
	@BeforeSuite
	public void firstMethod()
	{
		System.out.println("First method");
	}
    @BeforeTest
	public void secondMethod()
	{
		System.out.println("second method");
	}

	@BeforeClass
	public void thirdMethod()
	{
		System.out.println("third method");
	}

	@BeforeMethod
	public void fourMethod()
	{
		System.out.println("fourth method");
	}

	@Test
	public void fifthMethod()
	{
		System.out.println("Fifth method");
	}
	
    @AfterMethod 
	public void sixthMethod()
	{
		System.out.println("six method");
	}
    
  @AfterClass
	public void sevenMethod()
	{
		System.out.println("seven method");
	}

   @AfterTest
   public void eightMethod()
	{
		System.out.println("eight method");
	}
    @AfterSuite
	public void nineMethod()
	{
		System.out.println("ninth method");
	}

	

	
	
}
