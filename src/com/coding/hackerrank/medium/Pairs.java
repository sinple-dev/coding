package com.coding.hackerrank.medium;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Pairs {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int k = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		int result = Result10.pairs(k, arr);

		System.out.println(result);

		bufferedReader.close();
	}
}

class Result10 {

	public static int pairs(int k, List<Integer> arr) {
		// Write your code here

		int cnt = 0;

		Set<Integer> set = new HashSet<>(arr);

		for (int i = 0; i < arr.size(); i++) {
			if (set.contains(arr.get(i) - k)) {
				cnt++;
			}
		}

		return cnt;
	}
}
