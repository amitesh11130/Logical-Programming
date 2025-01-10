package com.ak.string;
/*
Given a balanced parentheses string s, return the score of the string.

    * The score of a balanced parentheses string is based on the following rule:
      1. "()" has score 1.
      2. AB has score A + B, where A and B are balanced parentheses strings.
      3. (A) has score 2 * A, where A is a balanced parentheses string.

        Example 1:
        Input: s = "()"
        Output: 1

        Example 2:
        Input: s = "(())"
        Output: 2

        Example 3:
        Input: s = "()()"
        Output: 2
 */

public class ScoreOfParentheses {
    public static void main(String[] args) {
        String s = "(())";
        System.out.println(scoreOfParentheses(s));
    }

    public static int scoreOfParentheses(String s) {
        int score = 0;
        int depth = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                ++depth;
            } else {
                --depth;
                if (s.charAt(i - 1) == '(') {
                    score += 1 << depth;
                }
            }
        }
        return score;
    }
}
