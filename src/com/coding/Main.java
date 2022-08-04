package com.coding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();

        main.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"});

    }

//    public int[] solution(int[][] data) {
//
//        Queue<int[]> queue = new LinkedList<>();
//
//        int[] answer = new int[data.length];
//        int time = 0;
//
//
//        for (int i = 0; i < data.length; i++) {
//            int[] print = data[i];
//
//            while(true) {
//
//                if(queue.isEmpty()) {
//                    queue.add(print);
//                    time += print[1];
//                    answer[i] = i;
//                    break;
//                } else {
//
//                    queue.poll();
//                }
//
//            }
//
//        }
//
//
//        return answer;
//
//    }

}

