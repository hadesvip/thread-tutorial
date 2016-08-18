package com.thread.volatil;

/**
 * Created by wangyong on 2016/8/18.
 */
public class ThreadB implements  Runnable{

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    public void run() {
        service.stopMethod();
    }
}
