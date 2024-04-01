package com.coding.backjoon;

import java.io.*;

public class _17413_reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '<') {
                while (str.charAt(i) != '>') {
                    System.out.print(str.charAt(i));
                    i++;
                }
                System.out.print(str.charAt(i));
            } else if (str.charAt(i) == ' ') {
                System.out.print(str.charAt(i));
            } else {

                String tmp = "";
                int j = i;
                while (j < str.length() && str.charAt(j) != ' ' && str.charAt(j) != '<') {
                    tmp += str.charAt(j);
                    j++;
                }
                i = (j - 1);
                System.out.print(new StringBuffer(tmp).reverse());

            }
        }
    }
}
