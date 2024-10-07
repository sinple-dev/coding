
package com.coding.hackerrank.medium;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Minimum_Loss {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Long> price = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Long::parseLong)
			.collect(toList());

		int result = Result12.minimumLoss(price);

		System.out.println(result);

		bufferedReader.close();
	}
}

class Result12 {

	public static int minimumLoss(List<Long> price) {
		// Write your code here

		long min = (Long.MAX_VALUE);

		TreeSet<Long> set = new TreeSet<>();

		// price.get(i) 값보다 큰값중에 가장 작은 값을 가져옴
		// set.add는 지나간 값을 넣어줌
		for (Long aLong : price) {
			Long higher = set.higher(aLong);
			if (higher != null) {
				min = Math.min(higher - aLong, min);
			}
			set.add(aLong);
		}

		return (int) min;


	}


}
