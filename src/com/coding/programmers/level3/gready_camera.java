package com.coding.programmers.level3;

import java.util.Arrays;

public class gready_camera {

    public static void main(String[] args) {
        gready_camera main = new gready_camera();

        int[][] routes = {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};
        System.out.println(main.solution(routes));


    }

    public int solution(int[][] routes) {
        Arrays.sort(routes, (a, b) -> a[1] - b[1]);
        int location = routes[0][1];
        int answer = 1;

        for (int i = 0; i < routes.length; i++) {
            if (location < routes[i][0]) {
                location = routes[i][1];
                answer++;
            }
        }
        return answer;
    }
}
