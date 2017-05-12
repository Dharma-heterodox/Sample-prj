package org.com.htc;

import java.util.ArrayList;

public class Challenges {
	
	public static void main(String[] dhrs)
	{
		ArrayList list1=new ArrayList();
		list1.add(0,0);
		list1.add(1,2);
		list1.add(2,3);
		list1.add(3,4);
		list1.add(4,5);
		list1.add(5,6);
		list1.add(6,7);
		list1.add(7,8);
		
		ArrayList list2=new ArrayList();
		list2.add(0,1);
		list2.add(1,2);
		list2.add(2,3);
		list2.add(3,5);
		System.out.println("List 1 Size :"+list1.size());
		//list1.removeAll(list2);
		for(Object i:list2){
			list1.remove(0);
		}
		
		System.out.println("List 1 Size :"+list1.size());
		
		System.out.println("List 1 "+list1.get(0));
		
	}

}
