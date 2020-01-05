package com.walker.jvm;

import java.nio.ByteBuffer;

/**
 * VM Args: -Xmx4048m -verbose:gc -XX:+PrintGCDetails
 * 未得到结果
 *
 * @author walker
 * @date 2020/1/5
 */
public class DirectOOM {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            ByteBuffer.allocateDirect(1024 * 1024);
            System.out.println(i);
        }
    }
}
