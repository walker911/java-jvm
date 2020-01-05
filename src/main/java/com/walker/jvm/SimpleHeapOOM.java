package com.walker.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms512m -Xmx512m -XX:+PrintGCDetails -XX:+PrintGCTimeStamps
 *
 * @author walker
 * @date 2020/1/5
 */
public class SimpleHeapOOM {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        for (int i = 0; i < 1024; i++) {
            list.add(new byte[1024 * 1024]);
        }
    }
}
