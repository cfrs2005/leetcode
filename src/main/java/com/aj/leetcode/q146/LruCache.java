package com.aj.leetcode.q146;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zhangqingyue
 * @date 2020/10/28
 */
public class LruCache extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LruCache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
