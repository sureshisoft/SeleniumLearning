package TestngExamples;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserExample implements IRetryAnalyzer{

	int failcount=0;
	int count=3;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(failcount<count)
		{
			failcount++;
			return true;
		}
		
		return false;
	}
	
	

}
