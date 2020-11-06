package com.aj.leetcode.q1114;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhangqingyue
 * @date 2020/11/6
 */
public class Foo {

    public AtomicInteger firstRun = new AtomicInteger(0);
    public AtomicInteger secondRun = new AtomicInteger(0);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {


        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstRun.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (firstRun.get() != 1) {

        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        secondRun.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (secondRun.get() != 1) {

        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
