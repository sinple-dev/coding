package com.coding.programmers.level1;

import java.io.IOException;
import java.util.Arrays;

public class hash_completion_player {

    public static void main(String[] args) throws IOException {
        hash_completion_player main = new hash_completion_player();
        System.out.println(
                main.solution(new String[]{"mislav", "stanko", "mislav", "ana", "aba"}, new String[]{"stanko", "ana", "mislav"})
        );
    }

    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {

            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length - 1];
    }

}



