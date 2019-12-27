package com.walker.jvm;

/**
 * <p>
 * -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:log/gc.log -Xmx20m -Xms5m
 * </p>
 *
 * @author mu qin
 * @date 2019/12/23
 */
public class PrintGCDetails {
    public static void main(String[] args) {
        System.gc();
        System.out.println("回收内存");

        System.out.print("Xmx=");
        System.out.println(Runtime.getRuntime().maxMemory() / 1024.0 / 1024 + "M");

        System.out.print("free mem=");
        System.out.println(Runtime.getRuntime().freeMemory() / 1024.0 /1024 + "M");

        System.out.print("total mem=");
        System.out.println(Runtime.getRuntime().totalMemory() / 1024.0 / 1024 + "M");
    }
}
