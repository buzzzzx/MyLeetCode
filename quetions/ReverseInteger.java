package quetions;

import static org.junit.Assert.*;

public class ReverseInteger {

    public static int solution(int x) {
        long num = 0;
        while (x != 0) {
            num = num * 10 + x % 10;
            x = x / 10;

            if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) num;
    }

    public static void test() {
        int actual = solution(321);
        int expect = 123;
        assertEquals(expect, actual);
    }

    public static void main(String[] args) {
        test();
    }
}
