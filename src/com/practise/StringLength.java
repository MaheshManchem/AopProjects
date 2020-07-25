package com.practise;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss = "mahesh raju";
		length(ss);
		trimString(ss);
		trimString2(ss);
	}
	
	public static void length(String ss){
		int count = 0;
		char[] cc = ss.toCharArray();
		for(char c:cc) {
			count++;
		}
		System.out.println(count);
	}
	
	public static void trimString(String ss) {
//		System.out.println(ss.replace(" ", ""));
		char[] cc = ss.toCharArray();
		for(char c:cc) {
			if(c != ' '){
				System.out.print(c);
			}
		}
	}
	
	public static void trimString2(String ss) {
		char[] cc = ss.toCharArray();
		StringBuffer br = new StringBuffer();
		for(int i=0;i<cc.length;i++) {
			System.out.println(cc[i]);
		}
		
	}
}