package quetions;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverseNum = 0;
        int original = x;
        while (x > 0) {
            reverseNum = reverseNum * 10 + x % 10;
            x = x / 10;
        }

        return reverseNum == original;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }

        String str = String.valueOf(x);
        for (int i = 0; i < str.length() / 2; i += 1) {
            if (str.charAt(i) != str.charAt(str.length() - i -1)) {
                return false;
            }
        }

        return true;
    }
}
