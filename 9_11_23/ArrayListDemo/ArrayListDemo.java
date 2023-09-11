package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Executive.pkg.main;

public class ArrayListDemo {
	public static void main(String[] args) {
		/*Itrator
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		Iterator<Integer> itr = new Iterator<list>(); {
		};
		*/
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <100; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		list.add(2,100);
		System.out.println(list);
		
		list.set(2,200);
		System.out.println(list);
		
		
		List<Integer> secondList = new ArrayList<>();
		
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);
		
		list.addAll(4, secondList);
		System.out.println(list);
		
		if(list.contains(200)) {
			System.out.println("List has the value");
		}
		else {
			System.out.println("List does not has the value");
		}
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(3);
		System.out.println(list);
	}

}
