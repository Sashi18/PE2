package com.stackroute.PE2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.PE2.PE2Class;

public class PE2Test {
	private static PE2Class pallindrome;
	
	@BeforeClass
	public static void setup() {
		pallindrome = new PE2Class();
	}
	
	@AfterClass
	public static void teardown() {
		pallindrome = null;
	}
	
	@Test
	public void isPalindromeTest() {

		assertEquals(true,pallindrome.isPallindrome("abababa"));
		
		assertNotEquals(false,pallindrome.isPallindrome("aba"));
		
		assertEquals(false,pallindrome.isPallindrome("abc"));
		
	}

	@Test
	public void isPow4Test() {

		assertEquals(true,pallindrome.isPow4(16));
		
		assertEquals(false,pallindrome.isPow4(81));
		
		assertNotEquals(true,pallindrome.isPow4(10));
		
	}

	@Test
	public void getMemVarTest() {

		assertArrayEquals(new Object[] {"Harry Potter", 30 ,2500.3}, pallindrome.ob.getMemVar("Harry Potter", 30 ,2500.3));
	    
		assertNotNull(pallindrome.ob.getMemVar("Harry Potter", 30 ,2500.3));

		assertNull(null, pallindrome.ob.getMemVar(null, 0, 0));
	}
	
	/*@Test
	public void pallindromeTest() {
		assertEquals(true, pallindrome.ispallindrome("arora"));
		assertEquals(null, pallindrome.ispallindrome(null));
		assertEquals(true, pallindrome.ispallindrome("arora"));
	}
	
	@Test
	public void pallindromeFailure() {
		assertNotEquals(false, pallindrome.ispallindrome("arora"));
	}
	
	@Test
	public void isPow4Test() {
		assertEquals(true, pallindrome.isPow4(256));
	}
	
	@Test
	public void isPow4Failure() {
		assertNotEquals(false, pallindrome.isPow4(64));
	}
	
	@Test
	public void MemVarTest() {
		assertArrayEquals(new Object[] {"Harry Potter", 30, 2500.3}, pallindrome.ob.getMemVar("Harry Potter", 30, 2500.3));
	}
	
	@Test
	public void MemVarFailure() {
		assertNotEquals(new Object[] {"Harry Potter", 30, 2500}, pallindrome.ob.getMemVar("Harry Potter", 30, 2500.3));
		assertNull(null, pallindrome.ob.getMemVar(null, 0, 0));
	}
	
	/*@Test
	public void fileTest() throws Exception {
		assertEquals(null, pallindrome.fileToUpper(new File("/home/shashi/README.md")));
	}
	
	/*@Test
	public void fileFailure() throws Exception {
		assertNotEquals(new File("/home/shashi/pmd-eclipse.log"), pallindrome.fileToUpper(new File("/home/shashi/README.md")));
	}
	
	*/@Test
	public void isEvenTest() {
		assertEquals(true, pallindrome.isEven(98));
		assertNotNull(pallindrome.isEven(22));
	}
	
	@Test
	public void isEvenFailure() {
		assertNotEquals(false, pallindrome.isEven(98));
		assertNotEquals(true, pallindrome.isEven(99));
	}
	
	@Test
	public void studentTest() {
		assertArrayEquals(new double[] {81.50, 65, 98}, pallindrome.stgrad(4,new int[]{86, 65, 98, 77}), 0);
		assertNotNull(pallindrome.stgrad(4,new int[]{86, 65, 98, 77}));
	}
	
	@Test
	public void studentFailure() {
		assertNotEquals(new double[] {81, 65, 98}, pallindrome.stgrad(4,new int[]{86, 65, 98, 77}));
	}
	
	@Test
	public void factTest() {
		assertEquals(3628800, pallindrome.longFactorial(10));
		assertNotNull(pallindrome.longFactorial(9));
	}
	
	@Test
	public void factFailure() {
		assertNotEquals(62270208, pallindrome.longFactorial(1));
		assertNotEquals(62270208, pallindrome.longFactorial(10));
	}
	
}