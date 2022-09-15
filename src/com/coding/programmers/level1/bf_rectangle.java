package com.coding.programmers.level1;


import java.util.Arrays;

public class bf_rectangle {

    public static void bf_rectangle(String[] args) {

        bf_rectangle main = new bf_rectangle();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(main.solution(sizes));

    }
    public int solution(int[][] sizes) {

        for (int i =0; i< sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }

        int maxW = 0;
        int maxH = 0;

        for (int i=0; i < sizes.length; i++) {

            if (sizes[i][0] > maxW) maxW = sizes[i][0];
            if (sizes[i][1] > maxH) maxH = sizes[i][1];
        }

        return maxW*maxH;

    }

}
