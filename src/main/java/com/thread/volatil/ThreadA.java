package com.thread.volatil;

/**
 * Created by wangyong on 2016/8/18.
 */
public class ThreadA implements Runnable {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    public void run() {

        service.runMethod();
    }
}
