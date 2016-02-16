package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import com.main.Palindrome;

public class PalindromeTest {
	
	@Test
	@Parameters("input")
	public void method1(String input){
		Palindrome p = new Palindrome();
		String actual = p.sameString(input);
		assertTrue(true, actual);
	}

}
