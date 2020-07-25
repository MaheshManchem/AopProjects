package com.practise;

public class ExceptionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("try");
			int a = 10/0;
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("last");
	}

}
