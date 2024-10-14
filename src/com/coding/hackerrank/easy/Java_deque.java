package com.coding.hackerrank.easy;

import java.util.*;

class Java_deque {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();

		int max = 0;
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();

			deque.add(num);
			set.add(num);

			if (deque.size() == m) {
				max = Math.max(set.size(), max);

				int first = (int) deque.removeFirst();
				if (!deque.contains(first)) {
					set.remove(first);
				}
			}
		}

		System.out.println(max);
	}


}