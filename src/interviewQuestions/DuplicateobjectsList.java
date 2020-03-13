package interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class DuplicateobjectsList {
//removing duplicates objects from the list
	/*
	 * 	
	 */

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Manila");
		list.add("krishna");
		list.add("Manila");
		list.add("krishna");
		list.add("Anil");
		list.add("Tanu");
		// output Tanu Anil Krishna Manila
//		System.out.println(list.size());
		List<String> m = removeDuplicate(list);
		for (String n : m) {
			System.out.println(n);
		}
		System.out.println("*************************");
		List<String> m2= removeDuplicate2(list);
		for (String n : m2) {
			//System.out.println(n);
		}

		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(90);
		l1.add(900);
		l1.add(300);
		l1.add(400);
		l1.add(400);
		l1.add(10);
		// System.out.println(l1);
		// hashset has no duplicates so using hashset
		HashSet hs = new HashSet(l1);
		// System.out.println(hs);
		ArrayList l2 = new ArrayList(hs);
		// System.out.println("Displaying elements from Arraylist after removing
		// elements:" + l2);

	}

	private static List<String> removeDuplicate(List<String> list) {
		List<String> l = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			boolean found = false;
			for (int j = 0; j < l.size(); j++) {
				if ((l.get(j).equals(list.get(i)))) {
					found = true;	
				}
			}
			if(!found) {
				l.add(list.get(i));
			}
			System.out.println("******************");
		}
		return l;
	}
	
	
	
	
	
	//removing duplicates in the same list
	private static List<String> removeDuplicate2(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			boolean found = false;
			for (int j = 1; j < list.size(); j++) {
				if (!(list.get(j).equals(list.get(i)))) {
					found = false;	
				}
			}
			if(found) {
				list.remove(list.get(i));
			}
		}
		return list;
	}
}
