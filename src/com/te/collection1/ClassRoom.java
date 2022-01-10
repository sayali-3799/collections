package com.te.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class ClassRoom {

	public static void main(String[] args) {
		Students student1 = new Students(1, "Sayali", 50);
		Students student2 = new Students(2, "Shashi", 35);
		Students student3 = new Students(3, "Hemanth", 55);
		Students student4 = new Students(4, "Sanjana", 60);
		
		HashSet<Students> hashSet = new HashSet<>();
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);

		Iterator<Students> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("++++++++++++++++++++++++++++++++++++");
		ArrayList<Students> arrayList = new ArrayList<>(hashSet);
		Collections.sort(arrayList, new SortByMarks());

		Iterator<Students> iterator2 = arrayList.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

	}

}
