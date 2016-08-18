package com.thread.volatil;

/**
 * isRunning存在在公共堆栈和线程私有栈中
 * 公共堆栈和私有栈变量不同步会导致线程死循环
 * volatile 强制从公共堆栈中取变量的值，保证了线程之间的可见性，但是不能保证原子性
 * synchronized 保证了多个线程之间访问资源的同步性
 * Created by wangyong on 2016/8/18.
 */
public class RunThread implements Runnable {

    volatile private boolean isRunning = true;

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void run() {
        System.out.println("进入run...");
        while (isRunning) {
        }
        System.out.println("退出run...");
    }


    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();

        new Thread(runThread).start();
        Thread.sleep(1000);
        runThread.setRunning(false);
        System.out.println("已经赋值给false");
    }
}
