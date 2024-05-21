package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _1747_palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[10000001];

        List<Integer> list = new ArrayList<>();
        arr[0] = arr[1] = true;

        for (int i = 2; i <= arr.length - 1; i++) {
            for (int j = i + i; j <= 10000000; j += i) {
                arr[j] = true;
            }

            if (i >= n && !arr[i]) {
                list.add(i);
            }
        }

        for (int i : list) {
            String num = String.valueOf(i);
            String reversed = new StringBuilder(num).reverse().toString();

            if (num.equals(reversed)) {
                System.out.println(num);
                return;
            }
        }
    }

}
