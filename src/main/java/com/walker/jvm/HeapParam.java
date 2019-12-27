package com.walker.jvm;

/**
 * <p>
 * -Xmx20m -Xms20m -Xmn1m -XX:+PrintGCDetails -Xloggc:log/gc.log
 * -Xmx20m -Xms20m -Xmn15m -XX:+PrintGCDetails
 * -Xmx20m -Xms20m -Xmn7m -XX:+PrintGCDetails
 * -Xmx20m -Xms20m -Xmn7m -XX:SurvivorRatio=2 -XX:+PrintGCDetails
 * -Xmx20m -Xms20m -XX:NewRatio=1 -XX:SurvivorRatio=2 -XX:+PrintGCDetails
 * -Xmx20m -Xms20m -XX:NewRatio=1 -XX:SurvivorRatio=3 -XX:+PrintGCDetails
 *
 * </p>
 *
 * @author mu qin
 * @date 2019/12/27
 */
public class HeapParam {
    public static void main(String[] args) {
        byte[] bytes = null;
        for (int i = 0; i < 10; i++) {
            bytes = new byte[1024 * 1024];
        }
    }
}
