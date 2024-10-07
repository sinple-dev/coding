
package com.coding.hackerrank.medium;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Stream;

public class KnightL_on_a_Chessboard {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> result = Result13.knightlOnAChessboard(n);

		result.stream()
			.map(
				r -> r.stream()
					.map(Object::toString)
					.collect(joining(" "))
			)
			.map(r -> r + "\n")
			.collect(toList())
			.forEach(e -> {
				System.out.print(e);
			});

		bufferedReader.close();
	}
}

class Result13 {


	public static List<List<Integer>> knightlOnAChessboard(int n) {
		// Write your code here

		return null;
	}
}
