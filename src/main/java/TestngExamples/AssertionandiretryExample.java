package TestngExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionandiretryExample {
	
	@Test(retryAnalyzer=RetryAnalyserExample.class)
	public void testCase1()
	{
		Assert.assertEquals(true, false);
		System.out.println("First Testcase");
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(true, false);
		System.out.println("Second Testcase");
	}

}
