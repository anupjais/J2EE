package com.myj2ee;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionExample implements Comparable<Integer> {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(50);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(list);
	}

	@Override
	public int compareTo(Integer o) {
//		if(this.)
		return 0;
	}

}
