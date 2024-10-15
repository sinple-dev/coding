package com.coding.hackerrank.medium;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;

public class Count_Luck {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				int n = Integer.parseInt(firstMultipleInput[0]);

				int m = Integer.parseInt(firstMultipleInput[1]);

				List<String> matrix = IntStream.range(0, n).mapToObj(i -> {
						try {
							return bufferedReader.readLine();
						} catch (IOException ex) {
							throw new RuntimeException(ex);
						}
					})
					.toList();

				int k = Integer.parseInt(bufferedReader.readLine().trim());

				String result = Result18.countLuck(matrix, k);

				System.out.println(result);

			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
	}
}

class Result18 {
	public static String countLuck(List<String> matrix, int k) {
		// Write your code here

		int n = matrix.size();
		int m = matrix.get(0).length();

		char[][] grid = new char[n][m];

		for (int i = 0; i < n; i++) {
			grid[i] = matrix.get(i).toCharArray();
		}

		int[] start = new int[2];
		int[] end = new int[2];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 'M') {
					start[0] = i;
					start[1] = j;
				} else if (grid[i][j] == '*') {
					end[0] = i;
					end[1] = j;
				}
			}
		}

		int count = 0;

		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};

		Queue<int[]> q = new LinkedList<>();
		q.add(start);

		boolean[][] visited = new boolean[n][m];
		boolean[][] visited2 = new boolean[n][m];

		visited[start[0]][start[1]] = true;

		while (!q.isEmpty()) {

			int[] cur = q.poll();

			if (cur[0] == end[0] && cur[1] == end[1]) {
				return count == k ? "Impressed" : "Oops!";
			}

			int wave = 0;
			for (int i = 0; i < 4; i++) {

				int x = cur[0] + dx[i];
				int y = cur[1] + dy[i];

				if (x < 0 || x >= n || y < 0 || y >= m || grid[x][y] == 'X' || visited[x][y]) {
					continue;
				}
				wave++;
				visited[x][y] = true;
				q.add(new int[] {x, y});
			}
			if (wave > 1) {
				count++;
				visited2[cur[0]][cur[1]] = true;
			}
		}

		return "Oops!";
	}

}
