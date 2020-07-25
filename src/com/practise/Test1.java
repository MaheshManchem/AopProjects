package com.practise;

public class Test1 {
	
	static String s = "mahesh";
	static int i =10;
	static String stringint = "10101";
	static double d1 = 111.22;
	static long l =1234567890;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(s);
		System.out.println(i);
		
		i = 10;
		String s1 = String.valueOf(i);
		System.out.println(s1.charAt(0));
	//	System.out.println(s1.getClass().getName());
		System.out.println(Integer.parseInt(stringint));
		System.out.println(String.valueOf(d1));
		System.out.println((int)d1);
		System.out.println(Double.valueOf(d1));
		System.out.println((int)l);
		System.out.println((long)i);
		System.out.println(Long.parseLong(stringint));
	}

}
