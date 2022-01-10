package com.te.collection1;

import java.util.ArrayList;
import java.util.Collections;


public class Sorting {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(80);
		list.add(30);
		list.add(40);
		Collections.sort( list);
		System.out.println(list);

	}

}
