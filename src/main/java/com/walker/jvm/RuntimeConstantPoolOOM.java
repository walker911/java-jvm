package com.walker.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * JDK6及之前
 * VM Args: -XX:PermSize=10m -XX:MaxPermSize=10m -verbose:gc -XX:+PrintGCDetails -XX:+PrintGCTimeStamps
 * JDK7之后不能得到相同的结果
 *
 * @author walker
 * @date 2020/1/5
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
