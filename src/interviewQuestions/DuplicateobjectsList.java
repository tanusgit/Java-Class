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
System.out.println(list.size());
		List<String> m = removeDuplicate(list);
		for (String n : m) {
			System.out.println(n);
		}

		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(90);
		l1.add(900);
		l1.add(300);
		l1.add(400);
		l1.add(400);
		l1.add(10);
	//	System.out.println(l1);
		// hashset has no duplicates so using hashset
		HashSet hs = new HashSet(l1);
		// System.out.println(hs);
		ArrayList l2 = new ArrayList(hs);
		//System.out.println("Displaying elements from Arraylist after removing elements:" + l2);

	}

	private static List<String> removeDuplicate(List<String> list) {
		List<String> l = new ArrayList<String>();
		try {
		
		int length = list.size();
		int count =0;
		for(int i = 0; i < length; i++) {
			if(!(l.get(count++).equals(list.get(i)))) {
				l.add(list.get(i));
			}
		}
		for (String n : l) {
			System.out.println(n);
		}
		
		
	}catch(Exception e) {
		
	}
		return l;
}}
