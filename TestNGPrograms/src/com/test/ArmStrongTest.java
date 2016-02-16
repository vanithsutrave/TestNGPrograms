package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.main.ArmStrong;
import static org.testng.Assert.*;


public class ArmStrongTest {
	
	@DataProvider(name="data")
	public static Object[][] getData(){
		Object[][] arr = {{153, true},{345, false},{371, true}};
		return arr;	
	}
	
	@Test(dataProvider="data")
	public void method(int input, boolean expected){
		ArmStrong as = new ArmStrong();
		boolean actual= as.number(input);
		assertEquals(actual,expected);	
	}
}
