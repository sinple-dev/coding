package com.coding.programmers.level1;

import java.io.IOException;
import java.util.HashMap;

public class kakao_character_type {

    public static void kakao_character_type(String[] args) throws IOException {
        kakao_character_type main = new kakao_character_type();

        System.out.println(main.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"},
                new int[]{5, 3, 2, 7, 5})

        );

    }

    HashMap<Character, Integer> map = new HashMap<>();
    String answer;

    public String solution(String[] survey, int[] choices) {

        for (int i = 0; i < survey.length; i++) {
            putMap(survey[i], choices[i]);
        }

        getType();
        return answer;
    }

    public void putMap(String type, Integer choice) {
        if (choice > 4) {
            map.put(type.charAt(1), map.get(type.charAt(1)) != null ? map.get(type.charAt(1)) + choice - 4 : choice - 4);
        } else {
            map.put(type.charAt(0), map.get(type.charAt(0)) != null ? map.get(type.charAt(0)) + 4 - choice : 4 - choice);
        }
    }

    public void getType() {
        String[] type = {"RT", "CF", "JM", "AN"};
        Character m1;
        Character m2;
        int p1;
        int p2;
        answer = "";
        for (int i = 0; i < type.length; i++) {
            m1 = type[i].charAt(0);
            m2 = type[i].charAt(1);
            if (map.get(m1) == null) {
                p1 = 0;
            } else {
                p1 = map.get(m1);
            }
            if (map.get(m2) == null) {
                p2 = 0;
            } else {
                p2 = map.get(m2);
            }

            if (p1 < p2) {
                answer += m2;
            }else answer += m1;
        }

    }


}



