package com.sys1yagi.java8.jack;

public interface Sample {

    static String test() {
        return "test";
    }

    default String text() {
        return "text";
    }
}
