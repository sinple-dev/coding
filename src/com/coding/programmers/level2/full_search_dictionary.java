package com.coding.programmers.level2;


import java.util.ArrayList;
import java.util.List;

public class full_search_dictionary {

    public static void main(String[] args) {
        full_search_dictionary main = new full_search_dictionary();
        System.out.println(main.solution("AAAAE"));
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


//    static List<String> list;
//    static String [] words = {"A", "E", "I", "O", "U"};
//    public int solution(String word) {
//        int answer = 0;
//        list = new ArrayList<>();
//        dfs("", 0);
//        int size = list.size();
//        for (int i = 0; i < size; i++) {
//            if (list.get(i).equals(word)) {
//                answer = i;
//                break;
//            }
//        }
//        return answer;
//    }
//
//    static void dfs(String str, int len) {
//        list.add(str);
//        if (len == 5) return;
//        for (int i = 0; i < 5; i++) {
//            dfs(str + words[i], len + 1);
//        }
//    }

}
