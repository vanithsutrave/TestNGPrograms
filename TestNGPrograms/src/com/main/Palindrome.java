package com.main;

public class Palindrome {

	public String sameString(String s){
	
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb.reverse());
		
		if(s.equals(sb.toString())){
			System.out.println("It is a Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		return s;
	}
}
