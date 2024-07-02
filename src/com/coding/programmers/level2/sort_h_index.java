package com.coding.programmers.level2;

import java.util.Arrays;

public class sort_h_index {

    public static void main(String[] args) {

        sort_h_index main = new sort_h_index();


        int[] citations = new int[]{3, 0, 6, 1, 5};

        System.out.println(main.solution(citations));

    }

    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;

            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }

}
