package com.interest.houseconstruction;

import static org.junit.Assert.*;

import org.junit.Test;

import com.interest.houseconstruction.CompoundInterest;
import com.interest.houseconstruction.SimpleInterest;

public class IntrestTesting {

	@Test
	public void test() {
		SimpleInterest si=new SimpleInterest();
		
		assertEquals(16000.00,si.totalamount(1000.00,5,3,1),2);
		
		CompoundInterest ci=new CompoundInterest();
		
		assertEquals(4125025.03,ci.totalamount(5000.00,3,3,4),2);
	}

}
