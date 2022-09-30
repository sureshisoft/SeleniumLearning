package javaExamples;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.testng.annotations.Test;

public class Hashmap {

    @Test
	public void getHashMap()
	{
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(10,"suresh");
		hm.put(11, "ramesh");
		hm.put(12,"ramesh");
		hm.put(12, "vignesh");
	//	System.out.println(hm.remove(10));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println("The entry set:"+hm.entrySet());
		for(Map.Entry en: hm.entrySet())
		{
			System.out.println(en.getKey() + " combination of key value pair" + en.getValue());
		}
		
		Hashtable<Integer,String> ht= new Hashtable<Integer,String>();
		ht.put(45, "james");
		System.out.println(ht.get(45));
		
	}
}
