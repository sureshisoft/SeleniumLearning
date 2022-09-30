package javaExamples;

public class Supersecondprogram extends superprogramone{
	
	
	public void  add()
	{
	  super.add();
	 System.out.println("this is child amount");
	 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Supersecondprogram pg=new Supersecondprogram();
		pg.add();
	}

}
