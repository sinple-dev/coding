package com.coding.programmers.level1;

public class practice_rectangle {

    public static void practice_rectangle(String[] args) {
        practice_rectangle main = new practice_rectangle();
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
