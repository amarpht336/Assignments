package com.example.tdd_test;

public class MissingElement {

	public int getMissingElement(int[] arr) {  
		int n=100;
		int actualSum = (n * (n + 1)) / 2; 
		int sum=0; 
		for(int i : arr) {
			sum+=i;
		} 
		System.out.println(actualSum);
		System.out.println(sum);
		return actualSum-sum;
	}

}
