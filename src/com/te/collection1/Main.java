package com.te.collection1;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;

	public class Main {
		public static void main(String[] args) {
			MyArrayList list = new MyArrayList(2);
			list.add("sayali");
			list.add(24);
			list.add(35);
			list.add(25);
			list.add(1);
			System.out.println(list.get(1));
			System.out.println(list);
			
			Iterator iterator = list.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			

		}
	}


