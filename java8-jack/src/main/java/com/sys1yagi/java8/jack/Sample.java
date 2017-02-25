package com.sys1yagi.java8.jack;

/**
 * Created by toshihiro-yagi on 2016/08/24.
 */

public interface Sample {

    static String test() {
        return "test";
    }

    default String text() {
        return "text";
    }
}
