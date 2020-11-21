package com.aj.thead.syncdemo.impl;

/**
 * @author zhangqingyue
 * @date 2020/11/21
 */
public class RunnableImpl implements Runnable {

    private int ticket = 100;
    public Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + " 读取 " + ticket + " 张票");
                    ticket--;
                }
            }
        }
    }
}
