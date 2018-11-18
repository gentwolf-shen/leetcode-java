package com.leetcode.code.simple;

public class RomanToInteger {
    public int romanToInt(String s) {
        int n = 0;
        char last = '0';
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int code = 0;

            switch (c) {
                case 'I':
                    code = (last == 'V' || last == 'X') ? -1 : 1;
                    break;
                case 'V':
                    code = 5;
                    break;
                case 'X':
                    code = (last == 'L' || last == 'C') ? -10 : 10;
                    break;
                case 'L':
                    code = 50;
                    break;
                case 'C':
                    code = (last == 'D' || last == 'M') ? -100 : 100;
                    break;
                case 'D':
                    code = 500;
                    break;
                case 'M':
                    code = 1000;
                    break;
            }
            last = c;
            n += code;
        }

        return n;
    }
}
