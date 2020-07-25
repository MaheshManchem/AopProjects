package com.practise;

public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=  "this program is a dummy one";
		String[] stringarray = s.split(" ");
		System.out.println(stringarray.length);
		charactercount(s);
	}
	
	public static void charactercount(String s) {
		int count = 0;
		char[] c = s.toCharArray();
		for(int i = 0 ; i<c.length ; i++) {
			if(c[i] != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
