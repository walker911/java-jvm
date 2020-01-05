package com.walker.jvm;

/**
 * 生成大量的类
 *
 * @author walker
 * @date 2020/1/5
 */
public class StringInternDemo {

    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        // "java"在执行toString(之前已经出现过？？？
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);

        String str3 = new StringBuilder("中国").append("人民").toString();
        System.out.println(str3.intern() == str3);

        String str4 = new StringBuilder("are").append("you").toString();
        System.out.println(str4.intern() == str4);
    }
}
