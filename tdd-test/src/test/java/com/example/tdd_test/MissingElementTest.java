package com.example.tdd_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingElementTest {
	
	@Test
	public void missingElementTest() {
		 MissingElement me = new MissingElement();
	        int[] arr = new int[100]; 
	        for (int i = 0; i < 100; i++) {
	            if (i + 1 != 30) { 
	                arr[i] = i + 1; 
	            } else {
	                arr[i] = 0;
	            }
	        }
	        int result = me.getMissingElement(arr);
	        assertEquals(30, result);
	}
}
