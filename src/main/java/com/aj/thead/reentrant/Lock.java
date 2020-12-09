package com.aj.thead.reentrant;

/**
 * @author zhangqingyue
 * @date 2020/12/9
 */
public class Lock {
    boolean isLocked = false;
    Thread lockedBy = null;
    int lockedCount = 0;

    public synchronized void lock() throws InterruptedException {
        Thread thread = Thread.currentThread();
        while (isLocked && lockedBy != thread) {
            wait();
        }
        isLocked = true;
        lockedCount++;
        lockedBy = thread;
    }


    public synchronized void unlock() {
        if (Thread.currentThread() == lockedBy) {
            lockedCount--;
            if (lockedCount == 0) {
                isLocked = false;
                notify();
            }
        }

    }
}
