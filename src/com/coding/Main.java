package com.coding;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();

        System.out.println(main.solution(2, 3));

    }

    public long solution(int w, int h)
    {
        long gcd = getGcd(w, h);
        return ((long) w * h) - (((w / gcd) + (h / gcd) - 1) * gcd);
    }

    private int getGcd(int n, int m)
    {
        while (m != 0)
        {
            int r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
}

