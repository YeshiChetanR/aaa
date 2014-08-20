/**
 * @author chetan
 *
 */
package com.atmecs.com.atmecs.ReportCreator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void test1() {
		System.out.println("Inside test one");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Inside test two");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Inside test three");
		//Assert.assertEquals("1", "0");
	}
	
	@Test
	public void test4()
	{
		System.out.println("Inside test four");
	}
	@Test
	public void test5() {
		System.out.println("Inside test five");
	}
	
	@Test
	public void test6()
	{
		System.out.println("Inside test six");
		//Assert.assertEquals("1", "0");
	}
	
	@Test
	public void test7()
	{
		System.out.println("Inside test seven");
		Assert.assertEquals("1", "0");
	}
	
	@Test
	public void test8()
	{
		System.out.println("Inside test eight");
	}
}
