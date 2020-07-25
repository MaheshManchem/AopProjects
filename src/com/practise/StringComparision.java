package com.practise;

public class StringComparision {

	public static void main(String[] args) {
		
		String s1 = new String("mahesh");
		String s2 = new String("mesh");
		
	//	System.out.println(s1==s2);
	//	System.out.println(s1.equals(s2));
		System.out.println(stringCompare(s1,s2));
	}
	
	public static int stringCompare(String s11,String s22) {
//		char[] c1 	= s11.toCharArray();
//		char[] c2 	= s22.toCharArray();
		int length1 = s11.length();
		int length2 = s22.length();
		int lmin 	= Math.min(length1, length2);
		System.out.println("lmin:"+lmin);
		for (int i = 0; i < lmin; i++) { 
            int str1_ch = (int)s11.charAt(i); 
            System.out.println(str1_ch);
            int str2_ch = (int)s22.charAt(i); 
            System.out.println(str2_ch);
            
            if (str1_ch != str2_ch) { 
                return str1_ch - str2_ch; 
            } 
        } 
  
        // Edge case for strings like 
        // String 1="Geeks" and String 2="Geeksforgeeks" 
        if (length1 != length2) { 
            return length1 - length2; 
        } 
  
        // If none of the above conditions is true, 
        // it implies both the strings are equal 
        else { 
            return 0; 
        } 
	}
}
