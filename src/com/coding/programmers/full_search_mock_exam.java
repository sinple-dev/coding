package com.coding.programmers;


import java.util.ArrayList;
import java.util.List;

public class full_search_mock_exam {

    public static void full_search_mock_exam(String[] args) {
        full_search_mock_exam main = new full_search_mock_exam();
        int[] answer = {1, 3, 2, 4, 2};
        main.solution(answer);
    }
    public int[] solution(int[] answers) {

        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {

            if (answers[i] == person1[i % 5])
                score[0]++;

            if (answers[i] == person2[i % 8])
                score[1]++;

            if (answers[i] == person3[i % 10])
                score[2]++;
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                result.add(i + 1);
            }
        }
        return result.stream().mapToInt(i -> i.intValue()).toArray();
    }

}
