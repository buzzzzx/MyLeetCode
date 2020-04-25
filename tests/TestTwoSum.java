package tests;

import org.junit.Test;
import quetions.TwoSum;
import static org.junit.Assert.*;


public class TestTwoSum {

    @Test
    public void basicTest() {
        int[] input1 = {2, 7, 14, 15};
        int[] actual1 = TwoSum.solution(input1, 9);
        int[] expect1 = {0, 1};
        assertArrayEquals(actual1, expect1);

        int[] input2 = {-1, -2, -3, -4, -5};
        int[] actual2 = TwoSum.solution(input2, -8);
        int[] expect2 = {2, 4};
        assertArrayEquals(actual2, expect2);
    }

}