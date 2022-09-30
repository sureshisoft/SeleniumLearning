package javaProgramsExample;

public class ThisExample {

	static int a;
	static int b;
	
	public void add(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisExample th= new ThisExample();
		th.add(2, 3);
		System.out.println("Values are:"+ a + b);
				
	}

}
