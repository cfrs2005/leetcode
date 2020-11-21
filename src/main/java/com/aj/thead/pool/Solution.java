package com.aj.thead.pool;

import com.aj.thead.pool.impl.RunnableImpl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhangqingyue
 * @date 2020/11/21
 */
public class Solution {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        es.submit(new RunnableImpl());

        es.submit(new RunnableImpl());
        es.shutdown();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " start run");
        }).start();

    }
}
