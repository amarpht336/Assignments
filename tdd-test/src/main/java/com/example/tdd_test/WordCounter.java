package com.example.tdd_test;

import java.util.HashSet;
import java.util.Set;

public class WordCounter {

	public String[] countUniqeWords(String paragraph) {
		// TODO Auto-generated method stub 
		String[] wordsInPara=paragraph.split(" ");  
		Set<String> uniqueWords= new HashSet<>(); 
		for(String word : wordsInPara) {
			uniqueWords.add(word);
		}
		wordsInPara=uniqueWords.toArray(new String[0]); 
		return wordsInPara;
	}
	
}
