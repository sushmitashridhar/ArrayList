package com.kodnest.arraylist;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;
public class Legacy {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(20);
		s.add(30);
		System.out.println(s);
		
		Vector v=new Vector();
		v.add(30);
		v.add(40);
		System.out.println(v);
		
		Hashtable h=new Hashtable();
		h.put(1, 10);
		h.put(2, 20);
		System.out.println(h);
		
		Properties p=new Properties();
		p.put(3, 70);
		p.put(4, 80);
		System.out.println(h);
		
		//stack
//		vector 
//		hashtable
//		properties
//		enumeration
//		dictionary
		
	}

}
