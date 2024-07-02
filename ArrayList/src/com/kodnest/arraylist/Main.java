package com.kodnest.arraylist;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
public class Main {
	public static void main(String[] args) {
		
		
		
		
		
	CopyOnWriteArrayList al=new CopyOnWriteArrayList();
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//			al.add(99);
//		}
//		int i=0;
//		while(i<al.size())
//		{
//		   System.out.println(al.get(i));
//		   i++;
//		   al.add(99);
//		}
//		for(Object ob:al)
//		{
//			System.out.println(ob);
//		}
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			al.add(99);
		}
		System.out.println(al);
	}

}
