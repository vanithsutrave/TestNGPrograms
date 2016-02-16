package com.test;

// This class contains all the test cases for testing Factclass 


import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import com.main.FactClass;


@Test(groups  = {"funcTest","checkTest"})
public class FactorialTest {
	
	@BeforeGroups({"checkTest"})
	public void before(){
		System.out.println("In before group");
	}
	
	@Test(groups  = {"checkTest"})
	public void method1(){
		int expected = 24;
		FactClass f = new FactClass();
		int actual = f.fact(4);
		assertEquals(expected, actual);
	}
	
	@Test(groups  = {"funcTest"})
	public void method2(){
		int expected = 120;
		FactClass f = new FactClass();
		int actual = f.fact(5);
		assertEquals(expected, actual);
	}
	
	@Test(groups  = {"funcTest","checkTest"})
	public void method3(){
		System.out.println("method1 and method2 successfully executed");
	}
	
	/* @Test(dependsOnGroups  = {"funcTest"})    //example of dependsOnGroups method
		public void method4(){
		System.out.println("In method4");
	} */

	@AfterGroups({"checkTest"})
	public void after(){
		System.out.println("In after group");
	}
	
}
