package com.javaproject.test;

import org.testng.annotations.Test;

public class AddNumbersTest {
	
	@Test
	public void AddNumberTest1() {
		int a =9;
		int b=3;
        int c=5;
		int d=15;
		int sum= a+b+c+d;
		System.out.println(sum);
	}

}
