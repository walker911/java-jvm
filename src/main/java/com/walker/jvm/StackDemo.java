package com.walker.jvm;

/**
 * VM Args: -Xmx1g -Xss1m -verbose:gc -XX:+PrintGCDetails -XX:+PrintGCTimeStamps
 * 未得到结果
 *
 * @author walker
 * @date 2020/1/5
 */
public class StackDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(10000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "Thread" + i).start();
            System.out.println("Thread" + i + " created");
        }
    }
}
