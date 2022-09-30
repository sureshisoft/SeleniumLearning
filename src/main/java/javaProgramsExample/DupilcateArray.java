package javaProgramsExample;

public class DupilcateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[]{1,2,2,3,4,4,5,5,6,7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					
				System.out.println("Duplicate number is "+a[j]);
			}
		}
		
	}

}
