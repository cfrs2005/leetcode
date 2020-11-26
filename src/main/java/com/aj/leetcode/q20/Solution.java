package com.aj.leetcode.q20;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author zhangqingyue
 * @date 2020/11/26
 */
public class Solution {
    public static final Map<Character, Character> map =
            new HashMap<Character, Character>() {{
                put('{', '}');
                put('[', ']');
                put('(', ')');
                put('?', '?');
            }};

    public boolean isValid(String s) {
        if (s.length() > 0 && !map.containsKey(s.charAt(0))) {
            return false;
        }
        LinkedList linkedList = new LinkedList() {{
            add('?');
        }};
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                linkedList.addLast(c);
            } else if (!map.get(linkedList.removeLast()).equals(c)) {
                return false;
            }
        }
        return linkedList.size() == 1;


    }

}
