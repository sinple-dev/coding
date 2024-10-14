package com.coding.hackerrank.easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Java_1D_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
		}
		scan.close();
	}

	public static boolean canWin(int leap, int[] game) {
		// Return true if you can win the game; otherwise, return false.

		Queue<Integer> queue = new LinkedList<>();

		queue.add(0);

		while(!queue.isEmpty()) {
			int i = queue.poll();

			if (i > game.length - 1) return true;

			if (i < 0 || game[i] == 1) continue;

			game[i] = 1;

			// if(i+leap < game.length) queue.add(i + 1);
			// if (i - 1 > 0) queue.add(i - 1);
			// if(i+leap < game.length) queue.add(i + leap);
			queue.add(i + 1);    // 오른쪽으로 한 칸 이동
			queue.add(i - 1);    // 왼쪽으로 한 칸 이동
			queue.add(i + leap); // 점프
		}

		return false;
	}

}