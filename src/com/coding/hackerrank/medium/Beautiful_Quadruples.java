package com.coding.hackerrank.medium;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beautiful_Quadruples {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] abcd = scanner.nextLine().split(" ");

		int a = Integer.parseInt(abcd[0].trim());

		int b = Integer.parseInt(abcd[1].trim());

		int c = Integer.parseInt(abcd[2].trim());

		int d = Integer.parseInt(abcd[3].trim());

		int result = Result19.beautifulQuadruples(a, b, c, d);

	}
}

class Result19 {

	List<int[]> list = new ArrayList<>();

	static int beautifulQuadruples(int a, int b, int c, int d) {



	}

}
