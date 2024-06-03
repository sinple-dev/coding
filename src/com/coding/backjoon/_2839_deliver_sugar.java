package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2839_deliver_sugar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //배달해야하는 무게가 총 몇 kg
        br.close();

        int basket = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                basket += n / 5;
                break;
            } else {
                n -= 3;
                basket++;
            }
            if (n < 0) {
                basket = -1;
            }
        }
        System.out.println(basket);
    }

}
