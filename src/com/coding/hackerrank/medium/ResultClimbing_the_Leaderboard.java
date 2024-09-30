package com.coding.hackerrank.medium;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;


public class ResultClimbing_the_Leaderboard {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		List<Integer> result = Result.climbingLeaderboard(ranked, player);

		result.forEach(System.out::println);

		// bufferedWriter.write(
		// 	result.stream()
		// 		.map(Object::toString)
		// 		.collect(joining("\n"))
		// 		+ "\n"
		// );

		bufferedReader.close();
		// bufferedWriter.close();
	}
}

class Result {

	/*
	 * Complete the 'climbingLeaderboard' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY.
	 * The function accepts following parameters:
	 *  1. INTEGER_ARRAY ranked
	 *  2. INTEGER_ARRAY player
	 */

	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		Set<Integer> set = new HashSet<>(ranked);
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list, Collections.reverseOrder());

		List<Integer> result = new ArrayList<>();

		for (int p : player) {
			int left = 0;
			int right = list.size() - 1;
			int mid = 0;

			while (left <= right) {
				mid = (left + right) / 2;
				if (p == list.get(mid)) break;

				if (p > list.get(mid)) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}

			}

			if (p < list.get(mid)) {
				result.add(mid + 2);
			} else {
				result.add(mid + 1);
			}
		}

		return result;
	}
}
