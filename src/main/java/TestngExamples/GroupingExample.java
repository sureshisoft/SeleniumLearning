package TestngExamples;

import org.testng.annotations.Test;

public class GroupingExample {
	
	
	@Test(groups={"ios"})
	public void apple1()
	{
		System.out.println("Applephone1");
	}
    @Test(groups={"ios"})
	public void apple2()
	{
		System.out.println("Applephone2");
	}

	@Test(groups={"android"})
	public void android1()
	{
		System.out.println("android1");
	}
	@Test(groups={"android"})
	public void android2()
	{
		System.out.println("android2");
	}

}
