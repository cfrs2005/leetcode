package com.aj.leetcode.q127;

import java.util.*;

/**
 * @author zhangqingyue
 * @date 2020/11/5
 */
public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (wordSet.size() == 0 || !wordSet.contains(endWord)) {
            return 0;
        }
        wordSet.remove(beginWord);

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        int step = 1;
        while (!queue.isEmpty()) {
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                String currentWord = queue.poll();
                if (changeWordEveryOneLetter(currentWord, endWord, queue, visited, wordSet)) {
                    return step + 1;
                }
            }
            step++;
        }
        return 0;
    }


    private boolean changeWordEveryOneLetter(String currentWord, String endWord,
                                             Queue<String> queue, Set<String> visited, Set<String> wordSet) {

        char[] charArray = currentWord.toCharArray();
        for (int i = 0; i < endWord.length(); i++) {
            char originChar = charArray[i];
            for (char str = 'a'; str < 'z'; str++) {
                if (str == originChar) {
                    continue;
                }
                charArray[i] = str;
                String nextWord = String.valueOf(charArray);
                if (wordSet.contains(nextWord)) {
                    if (nextWord.equals(endWord)) {
                        return true;
                    }
                    if (!visited.contains(nextWord)) {
                        queue.add(nextWord);
                        visited.add(nextWord);
                    }
                }
            }
            charArray[i] = originChar;
        }
        return false;
    }
}
