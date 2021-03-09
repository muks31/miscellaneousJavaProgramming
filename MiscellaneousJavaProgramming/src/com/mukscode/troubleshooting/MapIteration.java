package com.mukscode.troubleshooting;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Mukesh");
		map.put(2, "krishna");

		//Approach 1
		for(Map.Entry<Integer, String> mapItr : map.entrySet()) {
			System.out.println(mapItr.getKey() + " "+ mapItr.getValue());;
		}
		
		//Approach -2
		for(Integer i : map.keySet()) {
			System.out.println(i);
		}
		for(String name : map.values()) {
			System.out.println(name);
		}
		
		//Approach - 3
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> mapItr = itr.next();
			System.out.println(mapItr.getKey() +" "+ mapItr.getValue());
		}
		
		//Approach - 4
		map.forEach((key,value) -> System.out.println(key +" "+ value));
	}

}
