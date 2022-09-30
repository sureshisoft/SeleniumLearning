package javaExamples;

public class Testinterfacetwo implements TestInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testinterfacetwo it= new Testinterfacetwo();
		it.setData();
		it.getData();
		
	}

	public void setData() {
		// TODO Auto-generated method stub
		System.out.println("Interface Example set method");
	}

	public void getData()
	{
		System.out.println("Interface Example get method");
	}
}
