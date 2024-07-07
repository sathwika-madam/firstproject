package com.collections;

import java.util.ArrayDeque;

public class ArrayDemoDq {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		ad.add(90);
		ad.add(66);
		ad.add(20);
		ad.add(13);
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.poll());
		System.out.println(ad);
		ad.add(30);
		ad.addFirst(22);
		ad.addLast(77);
		System.out.println(ad);
		ad.remove();
		System.out.println(ad);
		







		
		

	}

}
