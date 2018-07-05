/**
 * 
 */
package com.bridgelabz.MavenProj;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class QuickBeforeAfterTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Class Started");
		System.out.println();
	}
	@Before
	public void setBefore() {
		System.out.println("Before Test");
	}

	@Test
	public void test1() {
		System.out.println("Test1 executed");
	}

	@Test
	public void test2() {
		System.out.println("Test2 executed");
	}

	@After
	public void setAfter() {
		System.out.println("After test");
		System.out.println();
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("Class Ended");
		System.out.println();
	}
}
