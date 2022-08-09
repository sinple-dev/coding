package com.coding.programmers;


public class full_search_dictionary {

    public static void full_search_dictionary(String[] args) {
        full_search_dictionary main = new full_search_dictionary();
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
