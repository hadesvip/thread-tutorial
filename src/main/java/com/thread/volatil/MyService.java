package com.thread.volatil;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by wangyong on 2016/8/18.
 */
public class MyService {

    public static AtomicLong count = new AtomicLong();

    public void addNum() {
        System.out.println(Thread.currentThread().getName() + "加了100之后的值为:" + count.addAndGet(100));
        count.addAndGet(1);
    }
}
