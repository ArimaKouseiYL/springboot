package com.wangzaiplus.test.thread;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: yilei
 * @Date: 2019/12/26
 * @Description:idea调试多线程
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName() + "-------------进入");

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(currentThread.getName() + "-------------离开");
        }
    }
}
