package com.ak.string;

import java.util.ArrayDeque;

public class Valid_String {

    public static void main(String[] args) {
        String s = "))";
        System.out.println(validString(s));
    }

    public static boolean validString(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        if (s.length() % 2 != 0)
            return false;

        for (final char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
