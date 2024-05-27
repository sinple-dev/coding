package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _6064_kaing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        StringTokenizer st1;
        boolean tf = false;

//        ex M=5, N=7
//        1: <1,1> 6: <1,6> 11<1,4> 16<1,2> 21<1,7> 26<1,5> 31<1,3>
//        2: <2,2> 7: <2,7> 12<2,5> 17<2,3> 22<2,1> 27<2,6> 32<2,4>
//        3: <3,3> 8: <3,1> 13<3,6> 18<3,4> 23<3,2> 28<3,7> 33<3,5>
//        4: <4,4> 9: <4,2> 14<4,7> 19<4,5> 24<4,3> 29<4,1> 34<4,6>
//        5: <5,5> 10:<5,3> 15<5,1> 20<5,6> 25<5,4> 30<5,2> 35<5,7>
//        n번째 % N 했을때 나머지가 N이 나옴 이공식을 알아내야함.

        for (int i = 1; i <= cnt; i++) {
            st1 = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st1.nextToken());
            int m = Integer.parseInt(st1.nextToken());
            int x = Integer.parseInt(st1.nextToken())-1;
            int y = Integer.parseInt(st1.nextToken())-1;

            for (int j = x; j < n * m; j += n) {

                if (j % m == y) {
                    System.out.println(j + 1);
                    tf = true;
                    break;
                }
            }
            if (!tf) {
                System.out.println(-1);
            }
            tf = false;
        }
    }
}
