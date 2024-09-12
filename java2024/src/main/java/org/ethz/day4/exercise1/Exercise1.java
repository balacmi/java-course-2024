package org.ethz.day4.exercise1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Exercise1 {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		Random random = new Random();
		for(int i = 0; i < 50000; i++) {
			
			list.add(random.nextInt(1000));
		}
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 50000; i++) {
			
			list.get(i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
		start = System.currentTimeMillis();
		Iterator<Integer> iterator = list.iterator();		
		
		while(iterator.hasNext())
			iterator.next();		
		
		end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}

}
