package com.coding.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stack_progresses_speeds {

    public static void main(String[] args) {
        stack_progresses_speeds main = new stack_progresses_speeds();

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println(Arrays.toString(main.solution(progresses, speeds)));

    }

    public int[] solution(int[] progresses, int[] speeds) {
        int[] temp = new int[100];
        int day = 0;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (speeds[i] * day) < 100) {
                day++;
            }
            temp[day]++;
        }


        List<Integer> list = new ArrayList<>();
        for (int n : temp) {
            if (n != 0) {
                list.add(n);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

}
