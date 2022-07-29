package javaExamples;

import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class LinkedListExamples {
	
	@Test
	public void getLinked()
	{
		LinkedList lt= new LinkedList();
		lt.addFirst(1);
		lt.add(3);
		lt.add(0);
		lt.addLast(8);
		System.out.println(lt);
		
		
	}

}
