package quetions;

import static org.junit.Assert.*;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class LongestSubstringWithoutRepeat {

    /**
     * HashSet, sliding window.
     */
    public static int lengthOfLongestSubstring1 (String s) {
        int best = 0;
        int leftSide = 0;
        int curr = 0;
        Set<Character> charSet = new HashSet<>();

        while (curr < s.length()) {
            char c = s.charAt(curr);
            while (charSet.contains(c)) {
                charSet.remove(s.charAt(leftSide));
                leftSide += 1;
            }
            charSet.add(c);
            best = Math.max(best, charSet.size());
            curr += 1;
        }
        return best;
    }

    /**
     * HashMap.
     */
    public static int lengthOfLongestSubstring2(String s) {
        int best = 0;
        int start = 0;
        int i;
        Map<Character, Integer> charIntMap = new HashMap<>();
        for (i = 0; i < s.length(); i += 1) {
            char c = s.charAt(i);
            if (charIntMap.containsKey(c) && charIntMap.get(c) >= start) {
                start = charIntMap.get(c) + 1;
            }

            best = Math.max(best, i - start + 1);
            charIntMap.put(c, i);
        }
        best = Math.max(best, i - start);
        return best;
    }

    private static void test() {
        int actual = lengthOfLongestSubstring1("abba");
        int expect = 2;
        System.out.println(actual);
        assertEquals(expect, actual);
    }

    public static void main(String[] args) {
        test();
    }
}
