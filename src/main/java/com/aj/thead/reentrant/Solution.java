package com.aj.thead.reentrant;


/**
 * with same thread so can set locked count and reentry
 *
 * @author zhangqingyue
 * @date 2020/12/9
 */
public class Solution {

    public Lock lock;


    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Solution solution = new Solution();
        solution.lock = new Lock();
        solution.print();
    }

    public void print() throws InterruptedException {
        lock.lock();
        add();
        lock.unlock();
    }

    public void add() throws InterruptedException {
        lock.lock();
        System.out.println("print lock");
        lock.unlock();
    }
}
