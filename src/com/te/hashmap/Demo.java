package com.te.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static  void main(String[] args) {
		HashMap hashMap = new HashMap();
	 hashMap.put(1,"Ramya");
	 hashMap.put(2,"Sunny");
	 hashMap.put(3,"Jaqee");
	 hashMap.put(4,"emmy");
	 Set<Integer> keySet = hashMap.keySet();
	 for(Integer i:keySet) {
		 System.out.println("keys :"+i+", values :"+hashMap.get(i));
	 }
	  Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
	  for(Entry<Integer,String>s:entrySet) {
		  System.out.println(s);
	  }
		  ArrayList arrayList = new ArrayList(entrySet);
		  System.out.println(arrayList);
		  }
		  
	  }
	


