package com.practise;

public class SBufferEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer br = new StringBuffer("mahesh");
		String s = "manchem";
		System.out.println(br);
		br.append("raju");
		System.out.println(br);
		System.out.println(br.reverse());
		System.out.println(s.length());
		char[] c = s.toCharArray();
		
		for(int i=s.length();i>0;i--) {
			System.out.print(c[i-1]);
		}
		System.out.println();
		System.out.println("substring "+s.substring(1,5));
		System.out.println("sub:"+br.substring(2));
	}
}