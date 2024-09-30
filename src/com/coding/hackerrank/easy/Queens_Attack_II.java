package com.coding.hackerrank.easy;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Queens_Attack_II {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int k = Integer.parseInt(firstMultipleInput[1]);

		String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int r_q = Integer.parseInt(secondMultipleInput[0]);

		int c_q = Integer.parseInt(secondMultipleInput[1]);

		List<List<Integer>> obstacles = new ArrayList<>();

		IntStream.range(0, k).forEach(i -> {
			try {
				obstacles.add(
					Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt)
						.collect(toList())
				);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = Result5.queensAttack(n, k, r_q, c_q, obstacles);

		System.out.println(result);

		bufferedReader.close();
	}
}

class Result5 {

	public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
		// Write your code here

		int[] dx = {1, -1, 0,  0, 1,  1, -1, -1};
		int[] dy = {0,  0, 1, -1, 1, -1,  1, -1};

		int[] q = {c_q, r_q};


		int answer = 0;

		for (int i = 0; i < dx.length; i++) {

			int qx = q[0];
			int qy = q[1];

			while(true) {

				qx = qx + dx[i];
				qy = qy + dy[i];

				if (qx < 1 || qx > n || qy < 1 || qy > n) {
					break;
				}

				boolean isObstacle = false;
				for (List<Integer> o : obstacles) {
					if (qx == o.get(1) && qy == o.get(0)) {
						isObstacle = true;
						break;
					}
				}
				if (isObstacle) {
					break;
				}
				answer++;
			}


		}
		return answer;
	}

}