package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Mina");
		l.add("Alina");
		l.add("Balina");
		l.add("Kalina");
		l.add("Zalina");
		l.add("Dalina");
		l.add("Calina");
		
		System.out.println("before sorting .....................");
		for(String s : l) {
			System.out.println(s);
		}
		System.out.println("***********************************************");
		Collections.sort(l);
		
		System.out.println("after sorting .....................");
		for(String s : l) {
			System.out.println(s);
		}
		
	}

}
