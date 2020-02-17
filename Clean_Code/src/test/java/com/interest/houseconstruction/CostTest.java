package com.interest.houseconstruction;

import static org.junit.Assert.*;

import org.junit.Test;

import com.interest.houseconstruction.CreateBill;

public class CostTest {

	@Test
	public void test() {
		
			CreateBill k= new CreateBill();
			assertEquals(240000.00,k.Cost("standard", 200),0);
			assertEquals(600000.00,k.Cost("Above standard", 400),0);
		assertEquals(540000.00,k.Cost("High Standard", 300),0);

		assertEquals(2500000.00,k.Cost("High Standard and Automated", 1000),0);
		

	}
	}