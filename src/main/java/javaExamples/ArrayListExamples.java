package javaExamples;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayListExamples {
	
	@Test
	public void getArrayList()
	{
		List lt =new ArrayList();
		lt.add(5);
		lt.add("suresh");
		lt.add(8);
		lt.add("Ramesh");
		lt.add("suresh");
		System.out.println(lt);
		System.out.println(lt.size());
		System.out.println("get the third position:"+lt.get(3));
		System.out.println(lt.set(3, "Vignesh"));
		System.out.println("get the third position:"+lt.get(3));
		System.out.println(lt.remove(1));
		System.out.println(lt);
		lt.remove("Vignesh");
		System.out.println(lt);
		List pt=new ArrayList();
		pt.add(5);
		
		
		pt.retainAll(lt);
		System.out.println("The retained content:"+pt);
		
	}

}
