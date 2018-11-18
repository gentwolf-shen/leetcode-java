package com.leetcode.code.simple;

public class ReverseInteger {
    public int reverse(int x) {
        int n = 0;
        try {
            String str = String.valueOf(x);
            StringBuilder builder = new StringBuilder();

            int end = 0;
            if (x < 0) {
                builder.append("-");
                end++;
            }

            for (int i = str.length() - 1; i >= end; i--) {
                builder.append(str.charAt(i));
            }
            n = Integer.parseInt(builder.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return n;
    }
}
