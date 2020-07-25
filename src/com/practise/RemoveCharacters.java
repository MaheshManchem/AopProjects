package com.practise;

public class RemoveCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mahesh";
		removecharcters('h',s);
	}

	private static void removecharcters(char c,String s) {
		StringBuilder sb= new StringBuilder();
		char[] chararray = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(chararray[i] == c) {
				
			}
			else {
				sb.append(chararray[i]);
			}
		}
		System.out.println(sb);
	}
	
	
}
