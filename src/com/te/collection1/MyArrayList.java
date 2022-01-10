package com.te.collection1;

import java.util.Iterator;

public class MyArrayList {
	Object[] array;
	int position;
	public MyArrayList(int size) {
		array=new Object[size];
		
	}
	public void add(Object obj) {
		if(position>=array.length) {
			growable();
		}
		array[position++]=obj;
		
	}
	public void growable() {
		Object[] temp=new Object[array.length+3];
		for (int i = 0; i < array.length; i++) {
			temp[i]=array[i];
			
		}
		array=temp;
	}
	public Object get(int index) {
		return   array[index];
	}
	public Iterator iterator() {
		return new MyItr();
	}
	@Override
	public String toString() {
		String s="["+ array[0];
		for (int i = 1; i < array.length; i++) {
			s+=","+array[i];
			
		}
		s+="]";
		
		return s;
	}
	
	private class MyItr implements Iterator{
		int index;

		@Override
		public boolean hasNext() {
			return (index<position)?true:false;
	
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return array[index++];
		}
		
	}
	
	


}

		