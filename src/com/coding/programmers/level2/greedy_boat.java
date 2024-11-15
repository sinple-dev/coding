package com.coding.programmers.level2;

import java.util.Arrays;

public class greedy_boat {

    public static void main(String[] args) {
        greedy_boat main = new greedy_boat();
        System.out.println(main.solution(new int[]{70, 50, 80, 50}, 100));

    }

    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int min = 0;
        for (int i = people.length - 1; i >= min; i--) {
            if (people[i] + people[min] <= limit) {
                answer++;
                min++;
            } else {
                answer++;
            }
        }
        return answer;
    }

}
