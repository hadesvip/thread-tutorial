package com.thread.volatil;

/**
 * Created by wangyong on 2016/8/18.
 */
public class Runner {

    public static void main(String[] args) {
        Service service = new Service();

        new Thread(new ThreadA(service)).start();

        new Thread(new ThreadB(service)).start();
        System.out.println("已经发起了停止指令... ");
    }
}
