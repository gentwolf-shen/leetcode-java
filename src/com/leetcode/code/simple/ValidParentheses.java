package com.leetcode.code.simple;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    private HashMap<Character, Character> map = new HashMap<>();

    public ValidParentheses() {
        this.map.put('(', ')');
        this.map.put('{', '}');
        this.map.put('[', ']');
    }

    public boolean isValid(String s) {
        boolean bl = true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0, len = s.length(); i < len; i++) {
            Character c = s.charAt(i);
            if (this.map.containsKey(c)) {
                stack.push(c);
            } else {
                Character left = stack.empty() ? ' ' : stack.pop();
                if (c != this.map.get(left)) {
                    bl = false;
                    break;
                }
            }
        }

        return bl && stack.empty();
    }
}
