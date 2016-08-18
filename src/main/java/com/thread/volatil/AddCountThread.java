package com.thread.volatil;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子操作类
 * Created by wangyong on 2016/8/18.
 */
public class AddCountThread implements Runnable {

    private AtomicInteger count = new AtomicInteger(0);

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }

    public static void main(String[] args) {
        AddCountThread addCountThread = new AddCountThread();

        new Thread(addCountThread).start();
        new Thread(addCountThread).start();
        new Thread(addCountThread).start();
        new Thread(addCountThread).start();

    }
}
