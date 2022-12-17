package com.edu;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyTest {

	@Test
	public void test() {
		System.out.println("Inside Of test");
		//fail("Not yet implemented");
	}
	@Test
	public void test1() {
		String s="hi";
		System.out.println("inside of test 1");
		assertEquals("hi", s);
	}
	@Before
	public void before() {
		System.out.println("before each test");
		
	}
	@After
public void after() {
		System.out.println("after each test");
	}
	@BeforeClass
	public  static void beforeclass() {
		System.out.println("before all method");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("after all method");
		System.out.println("finish");
	}

}
