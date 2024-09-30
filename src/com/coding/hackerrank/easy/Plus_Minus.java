package com.coding.hackerrank.easy;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Plus_Minus {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		Result2.plusMinus(arr);

		bufferedReader.close();
	}
}

class Result2 {
	public static void plusMinus(List<Integer> arr) {
		// Write your code here

		long count = arr.stream().filter(i -> i > 0).count();
		long count1 = arr.stream().filter(i -> i < 0).count();
		long count2 = arr.stream().filter(i -> i == 0).count();

		System.out.println((double) count / arr.size());
		System.out.println((double) count1 / arr.size());
		System.out.println((double) count2 / arr.size());

	}
}