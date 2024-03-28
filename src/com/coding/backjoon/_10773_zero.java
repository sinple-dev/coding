package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _10773_zero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        int[] zero = new int[num];
        for (int i = 0; i < num; i++) {
            zero[i] = Integer.parseInt(br.readLine());
        }

        ArrayList<Integer> stack = new ArrayList<>();

        for (int i =0; i < num; i++) {
            if (zero[i] == 0) {
                stack.remove(stack.size() - 1);
            } else {
                stack.add(zero[i]);
            }
        }

        int sum = 0;
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }

        System.out.println(sum);
    }

}
