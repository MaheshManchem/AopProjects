package com.practise;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
public class charcterscount {

	public static void main(String[] args) {
		String s = "mahesh raju manchem";
		char[] c = s.toCharArray();
		int count = 1;
		boolean check = true;
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<c.length;i++) {
			char c1 = c[i];
			if(map.get(c1) == null) {
				map.put(c1, count);
			}
			else {
				map.put(c1, map.get(c1)+1);
			}
		}
		System.out.println(map);
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
				if(entry.getValue() == 1) {
					System.out.println(entry.getKey());
			}	
		}	
		
		
		
	}
}
