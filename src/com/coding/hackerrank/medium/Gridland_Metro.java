package com.coding.hackerrank.medium;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Gridland_Metro {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		int k = Integer.parseInt(firstMultipleInput[2]);

		List<List<Integer>> track = new ArrayList<>();

		IntStream.range(0, k).forEach(i -> {
			try {
				track.add(
					Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt)
						.collect(toList())
				);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = Result14.gridlandMetro(n, m, k, track);

		System.out.println(result);
		bufferedReader.close();
	}
}

class Result14 {

	public static int gridlandMetro(int n, int m, int k, List<List<Integer>> track) {
		// Write your code here

		Map<Integer, List<int[]>> trackMap = new HashMap<>();

		for (List<Integer> t : track) {
			int r = t.get(0) - 1;
			int c1 = t.get(1) - 1;
			int c2 = t.get(2) - 1;

			if (!trackMap.containsKey(r)) {
				trackMap.put(r, new ArrayList<>());
			}
			trackMap.get(r).add(new int[]{c1, c2});
		}

		long totalCells = (long) n * m;
		long trackCells = 0;

		// 완성되지 못한 코드임.
		// List<int[]> 로 만들어서 중간에 비어있는 공간 있을 수 있음.
		// 다더해야해

		for (List<int[]> tracks : trackMap.values()) {
			tracks.sort(Comparator.comparingInt(a -> a[0]));
			int start = -1, end = -1;

			for (int[] track2 : tracks) {
				if (track2[0] > end) {
					trackCells += end - start + 1;
					start = track2[0];
					end = track2[1];
				} else {
					end = Math.max(end, track2[1]);
				}
			}
			trackCells += end - start + 1;
		}

		return (int)(totalCells - trackCells);


	}

}