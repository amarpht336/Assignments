package com.example.tdd_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordCounterTest {
	
	@Test
	public void TestCountUniqeWords() {
		WordCounter wc= new WordCounter(); 
		
		String paragraph = "this is a test paragraph for"
				+ " the uniqe word count method and this paragraph aims to test the method";
	    String[] result = wc.countUniqeWords(paragraph); 
	    assertEquals(result.length, 14);
	}
}
