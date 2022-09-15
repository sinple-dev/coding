package com.coding.programmers.level2;

import java.io.IOException;

public class kakao_string_zip {

    public static void kakao_string_zip(String[] args) throws IOException {
        kakao_string_zip main = new kakao_string_zip();
        main.solution("aaaaa");
    }

    public int solution(String s) {
        StringBuffer old = new StringBuffer(s);
        for (int i = 1; i <= s.length()/2; i++) {
            String tmp = s.substring(0, i);
            int cnt = 1;
            StringBuffer str = new StringBuffer();

            for (int j = i; j <= s.length(); j += i) {
                String jTmp = s.substring(j, i+j > s.length() ? s.length() : i+j);
                if (jTmp.equals(tmp)) {
                    cnt++;
                } else {
                    str.append((cnt > 1 ? cnt : "") + tmp);
                    tmp = jTmp;
                    cnt = 1;
                }
            }
            str.append(tmp);

            if (str.length() < old.length())
                old = str;

        }

        return old.length();
    }

}


