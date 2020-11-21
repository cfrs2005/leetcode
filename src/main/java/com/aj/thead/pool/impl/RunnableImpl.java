package com.aj.thead.pool.impl;

/**
 * @author zhangqingyue
 * @date 2020/11/21
 */
public class RunnableImpl implements  Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建了一个新的线程执行");

    }
}
