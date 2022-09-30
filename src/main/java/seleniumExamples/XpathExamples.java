package seleniumExamples;

public class XpathExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//parent scenario 
		
		//url:https://opensource-demo.orangehrmlive.com/

     //parent 
		
		//input[@name='txtPassword']/parent::div
		
		//Child 
		
		//div[@id='divPassword']//child::input
		
		
		//Ancestor - Fetching the Grandparent details hierarchy
		
		//input[@name='txtPassword']/ancestor::div
		
		//following - Knownelement - where ever the input tag is available all will be displaye 
		
		//input[@name='txtUsername']//following::input
		
		//sibling - one parent node-Fetching node only from the unique parent node- brother and sister from a father
		
		////div[@id='divPassword']//following-sibling::input
		
		// Preceeding - Sibling 
		
		//div[@id='divPassword']//preceding-sibling::input
		
		
	}

}
