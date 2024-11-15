package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1920_search_number {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int m = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();


		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			System.out.println(binarySearch(arr, num));

		}

	}

	public static int binarySearch(int[] arr, int num) {
		int left = 0;
		int right = arr.length - 1;
		int mid = 0;

		while(left <= right) {

			mid = (left + right) / 2;

			if (arr[mid] == num) {
				return 1;
			} else if (arr[mid] < num) {
				left = mid + 1;
			} else {
				right = mid -1;
			}
		}
		return 0;
	}


}
