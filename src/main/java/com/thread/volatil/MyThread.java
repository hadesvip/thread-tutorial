package com.thread.volatil;

/**
 * Created by wangyong on 2016/8/18.
 */
public class MyThread implements Runnable {

    private MyService service;

    public MyThread(MyService service) {
        this.service = service;
    }

    public void run() {
        service.addNum();
    }

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();

        new Thread(new MyThread(service)).start();
        new Thread(new MyThread(service)).start();
        new Thread(new MyThread(service)).start();
        new Thread(new MyThread(service)).start();
        new Thread(new MyThread(service)).start();

        Thread.sleep(1000);
        System.out.println(service.count.get());
    }
}
