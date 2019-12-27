package com.walker.jvm;

import java.util.Vector;

/**
 * <p>
 * -Xmx20m -Xms5m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=d:/a.dump
 * </p>
 *
 * @author mu qin
 * @date 2019/12/27
 */
public class HeapDumpOOM {
    public static void main(String[] args) {
        Vector<byte[]> v = new Vector<>();
        for (int i = 0; i < 25; i++) {
            v.add(new byte[1024 * 1024]);
        }
    }
}
