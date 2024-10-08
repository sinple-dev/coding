package com.coding.hackerrank.medium;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Bigger_is_Greater {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, T).forEach(TItr -> {
			try {
				String w = bufferedReader.readLine();

				String result = Result7.biggerIsGreater(w);

				System.out.println(result);

			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
	}
}

class Result7 {

	public static String biggerIsGreater(String w) {
		char[] arr = w.toCharArray();

		int changeIdx = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] > arr[i-1]) {
				changeIdx = i - 1;
				break;
			}
		}

		int minIdx = -1;
		for (int i = changeIdx + 1; i < arr.length; i++) {
			if (arr[changeIdx] < arr[i]) {
				if (minIdx > 0 && arr[minIdx] > arr[i]) {
					minIdx = i;
				} else if (minIdx == -1) {
					minIdx = i;
				}
			}
		}

		String result = "no answer";
		if (minIdx != -1) {
			char tmp = arr[changeIdx];
			arr[changeIdx] = arr[minIdx];
			arr[minIdx] = tmp;

			Arrays.sort(arr, changeIdx+1, arr.length);

			result = new String(arr);
		}
		return result;
	}
}
