package com.javaproject.test;

import org.testng.annotations.Test;

public class AddNumbersTest {
	
	@Test
	public void AddNumberTest1() {
		int a =9;
		int b=13;
                int c=5;
		int d=100;
		int sum= a+b+c+d;
		System.out.println(sum);
	}

}
