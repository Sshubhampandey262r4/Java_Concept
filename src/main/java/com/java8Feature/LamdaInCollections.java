package com.java8Feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class LamdaInCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);
        System.out.println("Elements of the ArrayList " + 
                              "before sorting : " + al);
 
        // using lambda expression in place of comparator object
        Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 :
                                       (o1 < o2) ? 1 : 0);
 
        System.out.println("Elements of the ArrayList after" + 
                                           " sorting : " + al);
        
        
        TreeSet<Integer> h = 
                new TreeSet<Integer>((o1, o2) -> (o1 > o2) ? 
                                   -1 : (o1 < o2) ? 1 : 0);
		 h.add(850);
		 h.add(235);
		 h.add(1080);
		 h.add(15);
		 h.add(5);
		 System.out.println("Elements of the TreeSet after" + 
		                             " sorting are: " + h);
		 
		 TreeMap<Integer, String> m = 
                 new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ? 
                                             -1 : (o1 < o2) ? 1 : 0);
      m.put(1, "Apple");
      m.put(4, "Mango");
      m.put(5, "Orange");
      m.put(2, "Banana");
      m.put(3, "Grapes");
      System.out.println("Elements of the TreeMap " + 
                           "after sorting are : " + m);

	}

}
