package com.coding.hackerrank.medium;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class The_Bomberman_Game {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int r = Integer.parseInt(firstMultipleInput[0]);

		int c = Integer.parseInt(firstMultipleInput[1]);

		int n = Integer.parseInt(firstMultipleInput[2]);

		List<String> grid = IntStream.range(0, r).mapToObj(i -> {
				try {
					return bufferedReader.readLine();
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
			})
			.collect(toList());

		List<String> result = Result8.bomberMan(n, grid);

		System.out.println(result.stream().collect(joining("\n")));

		bufferedReader.close();
	}
}

class Result8 {

	public static List<String> bomberMan(int n, List<String> grid) {

		int[] dx = {1, -1, 0,  0};
		int[] dy = {0,  0, 1, -1};

		int[][] arr = new int[grid.size()][grid.get(0).length()];

		for(int a = 0; a < grid.size(); a++) {

			for (int i = 0; i < grid.get(a).length() - 1; i++) {

				if (grid.get(a).charAt(i) == '.' && arr[a][i] == 0) {
					arr[a][i] = 0;
				} else if (grid.get(a).charAt(i) == 'O') {
					arr[a][i] = 1;
					for (int j = 0; j < dx.length; j++) {

						int x = a + dx[j];
						int y = i + dy[j];

						if (x >= 0 && x < grid.size() && y >= 0 && y < grid.get(0).length()) {
							arr[x][y] = 1;
						}
					}
				}
			}
		}

		List<String> result = new ArrayList<>();
		for (int[] ints : arr) {
			StringBuilder sb = new StringBuilder();
			for (int anInt : ints) {
				if (anInt == 0) {
					sb.append('O');
				} else {
					sb.append('.');
				}
			}
			result.add(sb.toString());
		}
		return result;

	}
}
