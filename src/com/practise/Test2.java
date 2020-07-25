package com.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="veera mahesh raju";
	//	unielements(s);
	//  convert(s);
		count(s);
	}
	
	public static void unielements(String s) {
		char[] ch = s.toCharArray();
	//	System.out.println(ch);
		Set s1 = new LinkedHashSet();
		for(char c:ch) s1.add(c);
		System.out.println(s1);
	}

	public static void convert(String s) {
		char[] ch =s.toCharArray();
		
		List l = new ArrayList() ;
		for(char c:ch) l.add(c);
		System.out.println(l);	
	}
	
	public static void count(String s) {
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		char[] c = s.toCharArray();
		
	
		for(char cc:c) {
			if(m.containsKey(cc)) {
			m.put(cc,m.get(cc)+1);
			}
			else {
				m.put(cc, 1);
			}
		}
		for (Map.Entry entry : m.entrySet()) { 
			System.out.println(entry.getKey() + " " + entry.getValue()); 
		} 
	}
}









