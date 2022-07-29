package TestngExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
	
	@Test
	@Parameters("Name")
	public void nameDisplay(String nam)
	{
		System.out.println("the name is "+ nam);
	}

}
