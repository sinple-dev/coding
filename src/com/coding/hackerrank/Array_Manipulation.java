package com.coding.hackerrank;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Array_Manipulation {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<List<Integer>> queries = new ArrayList<>();

		IntStream.range(0, m).forEach(i -> {
			try {
				queries.add(
					Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt)
						.collect(toList())
				);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		long result = Result5.arrayManipulation(n, queries);

		System.out.println(result);

		bufferedReader.close();
	}
}


class Result5 {

	public static long arrayManipulation(int n, List<List<Integer>> queries) {
		// Write your code here

		int[] arr = new int[n+2];

		for (int i = 0; i < queries.size(); i++) {

			int a = queries.get(i).get(0);
			int b = queries.get(i).get(1);
			int c = queries.get(i).get(2);

			arr[a] += c;
			arr[b+1] -= c;
		}

		long max = 0;
		long sum = 0;
		for (int a : arr) {
			sum += a;
			max = Math.max(max, sum);

		}

		return max;
	}
}