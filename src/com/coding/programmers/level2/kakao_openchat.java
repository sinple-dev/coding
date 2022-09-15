package com.coding.programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;

public class kakao_openchat {

    public static void kakao_openchat(String[] args) {
        kakao_openchat main = new kakao_openchat();
        main.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"});
    }

    public String[] solution(String[] record) {

        ArrayList<String> arr = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < record.length; i++) {
            String[] split = record[i].split(" ");
            if (split[0].equals("Enter")) {
                arr.add(split[0] + " " + split[1]);
                map.put(split[1], split[2]);
            } else if (split[0].equals("Leave")) {
                arr.add(split[0] + " " + split[1]);
            } else {
                map.put(split[1], split[2]);
            }
        }

        String[] answer = new String[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            String[] split = arr.get(i).split(" ");
            if (split[0].equals("Enter")) {
                answer[i] = in(map.get(split[1]));
            } else {
                answer[i] = out(map.get(split[1]));
            }
        }
        return answer;
    }

    public String in(String str) {
        return String.format("%s님이 들어왔습니다.", str);
    }

    public String out(String str) {
        return String.format("%s님이 나갔습니다.", str);
    }
}
