package com.mukscode.troubleshooting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(12);
		
		//Approach -1
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//Approach -2
		for(int i : list) {
			System.out.println(i);
		}
		
		//Approach - 3
		int i = 0;
		while(i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		
		//Approach -4
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Approach - 5
		ListIterator<Integer> listItr = list.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}

		//Approach - 6
		list.forEach(temp -> System.out.println(temp));
	}

}
