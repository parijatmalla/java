package com.imath;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ISumTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testISum() {
		ISum sOperator=new ISum(1, 1); 
		boolean isInstanceCreated=(sOperator ==null) ? false :true;
		assertTrue("Was able to create Class instance!", isInstanceCreated);
		sOperator=null;
	}

	@Test
	public void testIsInputValid() {
		ISum sOperator=new ISum(1, 1); 
		assertTrue("Valied int 1 and 1 as input ", sOperator.isInputValid());
		sOperator=null;
	}

	@Test
	public void testCompute() {
	ISum sOperator=new ISum(2, 3);
	sOperator.compute();
	assertEquals("Result for 2 + 3 should be 5", sOperator.result(),5);
	
	sOperator=new ISum(-2, 3);
	sOperator.compute();
	assertEquals("Result for -2 + 3 should be 1", sOperator.result(),1);
	
	sOperator=new ISum(-2, -3);
	sOperator.compute();
	assertEquals("Result for -2 + -3 should be -5", sOperator.result(),-5);
	sOperator=null;
	}

	@Test
	public void testResult() {
		
		ISum sOperator=new ISum(4,3);
		
		assertTrue("Result is returned",(sOperator.result()==null) ? false:true);
		
	}

}
