package com.coding.programmers.level2;

import java.io.IOException;

public class practice_jadencase {

    public static void main(String[] args) throws IOException {
        practice_jadencase main = new practice_jadencase();
        System.out.println(
                main.solution("3people   unFollowed me ")
        );
    }

    public String solution(String s) {
        String[] arr = s.toLowerCase().split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].replace(" ", "").length() == 0) continue;
            arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
        }

        String answer = String.join(" ", arr);
        if (s.endsWith(" ")) answer += " ";
        return answer;
    }

}



