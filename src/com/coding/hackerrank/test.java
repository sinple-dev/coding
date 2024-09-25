package com.coding.hackerrank;

import java.util.*;
import java.io.*;

public class test {


	public static void main(String[] args) {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		HashMap<String, Integer> user = new HashMap<>();


		in.nextLine();


		for(int i=0; i < n; i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();

			user.put(name, phone);
		}

		for (int i = 0; i < n; i++) {

			String name = in.nextLine();

			if (user.get(name) == null) {
				System.out.println("Not found");
			} else {
				System.out.println(name + "=" + user.get(name));
			}
		}
	}

}
