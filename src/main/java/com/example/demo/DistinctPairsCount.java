package com.example.demo;

import java.util.HashMap;
import java.util.Map;

 public class DistinctPairsCount {
	public static int getPairsCount(int arr[], int targetValue) {
		
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == targetValue) {
					if (!(pairs.containsKey(arr[j]) && pairs.containsValue(arr[i])))
						pairs.put(arr[i], arr[j]);
				}
			}
		}
		return pairs.size();

	}
	
	public static void main(String[] args) {
		
		int data[] = {1,2,3,6,7,8,9,1};
		System.out.println(getPairsCount(data, 10));
	}
}
//https://www.geeksforgeeks.org/count-pairs-difference-equal-k/
