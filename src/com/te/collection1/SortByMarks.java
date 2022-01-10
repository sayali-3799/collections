package com.te.collection1;

import java.util.Comparator;

public class SortByMarks implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {

		return o1.marks-o2.marks;
	}



	}

