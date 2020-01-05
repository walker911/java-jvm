package com.walker.jvm;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * JDK8: 永久代移除
 * VM Args: -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m -verbose:gc -XX:+PrintGCDetails -XX:+PrintGCTimeStamps
 *
 * @author walker
 * @date 2020/1/5
 */
public class PermDemo {
    public static void main(String[] args) {
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> methodProxy.invokeSuper(o, objects));
            enhancer.create();
        }
    }

    static class OOMObject {

    }
}
