package ch15.lecture.p04sortedset;

import java.util.*;

public class C06Sortedset {
	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<>();
		
		set.add(300);
		set.add(100);
		set.add(99);
		set.add(10000);
		set.add(-1);
		
		System.out.println(set);
		
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet(100));
		System.out.println(set.tailSet(500));
		
		NavigableSet<Integer> nset = (NavigableSet<Integer>) set;
		System.out.println(nset.lower(99));
	}
}
