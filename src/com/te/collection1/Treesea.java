package com.te.collection1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class Treesea {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(50);
		treeSet.add(60);
		for (Object obj : treeSet) {
			System.out.println(obj);
			List<Integer> list = new ArrayList<Integer>(treeSet);
			System.out.println("+++++++++++++++++++++++++++++++++++++++");
			ListIterator<Integer> listIterator = list.listIterator(list.size());
			while (listIterator.hasPrevious()) {
				System.out.println(listIterator.previous());
			}
		}

	}

}
