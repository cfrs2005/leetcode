package com.aj.leetcode.q316;

import java.util.Stack;

/**
 * @author zhangqingyue
 * @date 2020/12/20
 */
public class Solution {

    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (stack.contains(ch)) {
                continue;
            }

            while (!stack.isEmpty() && stack.peek() > ch && s.indexOf(stack.peek(), i) != -1) {
                stack.pop();
            }
            stack.push(ch);
        }
        char[] chars = new char[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            chars[i] = stack.get(i);
        }
        return new String(chars);
    }


}
