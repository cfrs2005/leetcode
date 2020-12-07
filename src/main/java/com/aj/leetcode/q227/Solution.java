package com.aj.leetcode.q227;

import java.util.Stack;

/**
 * @author zhangqingyue
 * @date 2020/12/7
 */
public class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] cs = s.toCharArray();
        Integer num = 0;
        Integer n = cs.length;
        char prevSign = '+';
        for (int i = 0; i < n; i++) {
            if (cs[i] != ' ') {
                if (Character.isDigit(cs[i])) {
                    num = num * 10 + (cs[i] - '0');
                } else {
                    stack = doing(stack, num, prevSign);
                    num = 0;
                    prevSign = cs[i];
                }
            }
        }
        stack = doing(stack, num, prevSign);

        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }

    public Stack<Integer> doing(Stack<Integer> stack, Integer num, char prevSign) {
        switch (prevSign) {
            case '*':
                stack.push(stack.pop() * num);
                break;
            case '/':
                stack.push(stack.pop() / num);
                break;
            default:
                stack.push(prevSign == '+' ? num : -num);
                break;
        }
        return stack;
    }

}
