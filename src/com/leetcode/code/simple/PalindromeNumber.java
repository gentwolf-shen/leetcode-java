package com.leetcode.code.simple;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int len = str.length();

        boolean bl = true;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                bl = false;
                break;
            }
        }

        return bl;
    }
}
