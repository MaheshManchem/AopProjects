package com.practise;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "mahesh raju manchem";
		StringBuffer br = new StringBuffer(name);
		System.out.println(br.reverse());
		reversename(name);
		reverse1(name);
	}
	
	public static void reversename(String s) {
		char[] cc = s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(cc[i]);
		}
	}
	
	public static void reverse1(String ss) {
		int length = ss.length();
		char[] cc1 = ss.toCharArray();
		char[] cc2 = new char[cc1.length] ;
		
		for(int i=0;i<length;i++) {
			cc2[i] = cc1[length-i-1];
		}
		System.out.println();
		System.out.println(cc2);
	}
}
