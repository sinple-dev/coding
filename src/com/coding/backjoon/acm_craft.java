package com.coding.backjoon;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class acm_craft {

    public static void stack_printer() {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();

        while (0 < cnt--) {
            int build = in.nextInt();
            int rule = in.nextInt();

            int[] time = new int[build];
            for (int i=0; i < build; i++) {
                time[i] = in.nextInt();
            }

            int[][] road = new int[2][rule];
            for (int i=0; i < rule; i++) {
                road[0][i] = in.nextInt();
                road[1][i] = in.nextInt();
            }

            int distance = in.nextInt();


        }

    }

}
