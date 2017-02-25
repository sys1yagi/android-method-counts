package com.sys1yagi.java8_retrolambda.testtool;


public class Spec {

    public interface It {

        void invoke();
    }

    public static void it(String message, It it) {
        it.invoke();
    }
}
