package com.coding;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();

        System.out.println(main.solution("I"));

    }

    public int solution(String word) {
        int answer = 0;
        int[] arr = {781, 156, 31, 6, 1};
        String dic = "AEIOU";
        for (int i = 0; i < word.length(); i++) {
            answer += dic.indexOf(word.charAt(i)) * arr[i] + 1;
        }

        return answer;

    }

}

