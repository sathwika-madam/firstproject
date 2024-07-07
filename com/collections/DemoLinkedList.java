package com.collections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class DemoLinkedList {
	public static void main(String[] args) {
		List<Double> list=new LinkedList<Double>();
		list.add(2000.02);
		list.add(2502.07);
		list.add(3600.08);
		list.add(2015.02);
		list.add(450.44);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(0);
		System.out.println(list);
		System.out.println(list);
		Iterator <Double> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Max=" +Collections.max(list));
		System.out.println("Min=" +Collections.min(list));
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
			}

}
