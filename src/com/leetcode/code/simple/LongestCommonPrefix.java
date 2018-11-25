package com.leetcode.code.simple;

/**
 * 取第一个字符串，从第1~N位比较所有数组的相同位。
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        StringBuilder builder = new StringBuilder();
        for (int i = 0, wordLength = strs[0].length(); i < wordLength; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1, len = strs.length; j < len; j++) {
                if (i >= strs[j].length() || c != strs[j].charAt(i)) {
                    return builder.toString();
                }
            }
            builder.append(c);
        }

        return builder.toString();
    }
}
