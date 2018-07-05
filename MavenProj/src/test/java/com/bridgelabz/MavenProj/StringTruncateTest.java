/**
 * 
 */
package com.bridgelabz.MavenProj;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @date
 * @project_name
 * 
 */
public class StringTruncateTest {
	StringTruncate trunc;
	
	@Before
	public void setBefore() {
		trunc = new StringTruncate();
	}
	@Test
	public void testTruncateAInFirst2Positions_AinFirstTwoPos() {
		assertEquals("CD", trunc.truncateAInFirst2Positions("AACD"));
			}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPos() {
		assertEquals("CD", trunc.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AisNotPresent() {
		assertEquals("CDEF", trunc.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AatLastPos() {
		assertEquals("CDAA", trunc.truncateAInFirst2Positions("CDAA"));
	}
	@Test
	public void testAreFirstAndLastTwoCharSame_PosSenario() {
		assertTrue(trunc.areFirstAndLastTwoCharSame("ABAB"));
	}
	@Test
	public void testAreFirstAndLastTwoCharSame_NegSenario() {
		assertFalse(trunc.areFirstAndLastTwoCharSame("ABCD"));
	}
	@Test
	public void testAreFirstAndLastTwoCharSame_PosSenarioTwo() {
		assertTrue(trunc.areFirstAndLastTwoCharSame("AB"));
	}
	@Test
	public void testAreFirstAndLastTwoCharSame_NegSenarioTwo() {
		assertFalse(trunc.areFirstAndLastTwoCharSame("A"));
	}
}
