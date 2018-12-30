package com.junitdemo;
import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Test;
public class TestUtility {
	@Test
	public void testAdd(){
		Utility ut = new Utility();
		Assert.assertEquals(25, ut.add(10, 15));
	}
	
	@Test
	public void testAdd1(){
		Utility ut = new Utility();
		Assert.assertEquals(25, ut.add(-10, 15));
	}
	public void testUserValid(){
		
	}
	@Test
	public void testValidateValid(){
		Utility ut = new Utility();
		Assert.assertTrue(ut.validate(100, 50));
	}
	@Test
	public void testValidateInValid(){
		Utility ut = new Utility();
		Assert.assertTrue(ut.validate(-100, 50));
	}
	@Test
	public void testingTest(){
		Utility ut = new Utility();
		Assert.assertEquals(2,ut.test(100, 50),0);
	}
	@Test(expected=Exception.class)
	public void testingTestInvalid(){
		Utility ut = new Utility();
		 @SuppressWarnings("unused")
		double result = ut.test(100,0);
	}
	@Test(expected=Exception.class)
	public void testingFile() throws FileNotFoundException{
		Utility ut = new Utility();
		  ut.openFile("abc.txt");
	}
}
