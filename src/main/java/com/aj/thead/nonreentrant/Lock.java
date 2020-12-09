package com.aj.thead.nonreentrant;

/**
 * @author zhangqingyue
 * @date 2020/12/9
 */
public class Lock {

    private boolean isLocked = false;

    public synchronized void lock() throws InterruptedException {
        while (isLocked) {
            wait();
        }
        isLocked = true;
    }

    public synchronized void unlock() {
        isLocked = false;
        notify();
    }

}
