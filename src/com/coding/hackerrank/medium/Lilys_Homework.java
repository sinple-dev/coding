package com.coding.hackerrank.medium;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lilys_Homework {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		int result = Result9.lilysHomework(arr);

		System.out.println(result);

		bufferedReader.close();
	}
}

class Result9 {

	public static int lilysHomework(List<Integer> arr) {
		// Write your code here

		Map<Integer, Integer> sortedMap = new TreeMap<>();

		for (int i = 0; i < arr.size(); i++) {
			sortedMap.put(arr.get(i), i);
		}

		int left = 0, cnt = 0;
		for (Map.Entry<Integer, Integer> en : sortedMap.entrySet()) {
			int idx = en.getValue();

			if (idx != left) {
				int temp = arr.get(idx);
				arr.set(idx, arr.get(left));
				arr.set(left, temp);
				cnt++;
			}
			left++;
		}

		return cnt;

	}
}
