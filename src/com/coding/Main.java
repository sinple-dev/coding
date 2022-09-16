package com.coding;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(
                main.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500})
        );
    }

    public int[] solution(String[] genres, int[] plays) {

        int[] answer = {};

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();


        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> total = new HashMap<>();


        for (int i = 0; i < genres.length; i++) {
            set.add(genres[i]);
            if (map.containsKey(genres[i])) {
                map.put(genres[i], total.get(genres[i]) + plays[i]);
            } else {
                map.put(genres[i], plays[i]);
            }
        }

        return answer;

    }

}



