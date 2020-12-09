package com.aj.thead.nonreentrant;

/**
 * lock with same lock ,can't use again
 *
 * @author zhangqingyue
 * @date 2020/12/9
 */
public class Solution {

    public Lock lock;

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
