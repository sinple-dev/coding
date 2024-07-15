package com.coding.programmers.level1;


import java.util.Arrays;

public class gready_health_clothes {

    public static void main(String[] args) {

        gready_health_clothes main = new gready_health_clothes();

        System.out.println(main.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));

    }

    public int solution(int n, int[] lost, int[] reserve) {

        int[] students = new int[n];
        Arrays.fill(students, 1);

        boolean[] visit = new boolean[n];
        Arrays.fill(visit, false);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] -1 == reserve[j] && !visit[lost[i] - 1]) {
                    visit[lost[i] - 1] = true;
                    break;
                }
                if (lost[i] + 1 == reserve[j] && !visit[lost[i] - 1]) {
                    visit[lost[i] - 1] = true;
                    break;
                }


            }

        }

        return n;
    }

}
