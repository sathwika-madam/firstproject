package com.collections;
import java.util.LinkedHashMap;
public class DemoLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> countrycodes=new LinkedHashMap<String,Integer>();
		countrycodes.put("US",1);
		countrycodes.put("India",91);
		countrycodes.put("Russia",7);
		countrycodes.put("China",86);
		countrycodes.put("Pakistan",92);
		System.out.println(countrycodes);
		System.out.println(countrycodes.values());
		System.out.println(countrycodes.size());
		System.out.println(countrycodes.isEmpty());
	}
}
