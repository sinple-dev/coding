package com.coding.programmers.level3;

import java.util.Arrays;

public class binary_search_immigration {
	public static void main(String[] args) {
		binary_search_immigration main = new binary_search_immigration();
		System.out.println(main.solution(6, new int[]{7, 10}));
	}

	public long solution(int n, int[] times) {

		Arrays.sort(times);
		long min = 1;

		// times 배열의 최악의 경우는 범위
		// n명 기준으로 times의 가장 마지막 시간까지 탐색하는 경우.
		long max = (long) times[times.length-1]*n;
		long mid = 0;
		long sum;
		long answer = max;

		while(min <= max) {
			sum = 0;
			mid = (min + max) / 2;

			for(int time : times) {
				sum += mid / time;
			}

			if(sum >= n) {
				answer = mid;
				max = mid - 1;
			}
			else {
				min = mid + 1;
			}
		}

		return answer;
	}
}
