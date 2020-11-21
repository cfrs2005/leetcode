package com.aj.thead.syncdemo;

import com.aj.thead.syncdemo.impl.RunnableImpl;

/**
 * @author zhangqingyue
 * @date 2020/11/21
 */
public class Solution {

    public static void main(String[] args) {
        Runnable run = new RunnableImpl();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();

    }
}
