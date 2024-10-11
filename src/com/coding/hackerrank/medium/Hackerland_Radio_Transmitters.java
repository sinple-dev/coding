package com.coding.hackerrank.medium;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Hackerland_Radio_Transmitters {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int k = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> x = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		int result = Result15.hackerlandRadioTransmitters(x, k);

		System.out.println(result);

		bufferedReader.close();
	}
}

class Result15 {


	public static int hackerlandRadioTransmitters(List<Integer> x, int k) {

		int[] arr = x.stream().mapToInt(i -> i).toArray();
		Arrays.sort(arr);

		int count = 0;
		int i = 0;
		while (i < arr.length) {
			count++;

			int loc = arr[i] + k;
			// + k 만큼 더해서 첫번째 집부터 시작해서 커버 가능한 집까지 찾고,
			while (i < arr.length && arr[i] <= loc) {
				i++;
			}

			// 커버 가능한 집을 찾으면, 그 집에서 + k 만큼 더해서 커버 가능한 집을 찾는다.
			// 또 + k 해주는 것은 위 루프에서 loc은 arr[i] <= loc 로 앞에서부터 커버 가능한곳 찾은거고
			// loc에서 다시 + k 해줘서 그쪽까지 커버 가능한곳 찾는거지

			loc = arr[--i] + k;
			while (i < arr.length && arr[i] <= loc) {
				i++;
			}
		}

		return count;
	}



}
