package com.thread.volatil;

/**
 * Created by wangyong on 2016/8/18.
 */
public class Service {
    private boolean isContinueRun = true;

    public void runMethod() {
        while (isContinueRun) {
        }
        synchronized (Service.class) {

        }

        System.out.println("停下来了...");
    }

    public void stopMethod() {
        this.isContinueRun = false;
    }

}
