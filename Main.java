package com.example;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        Class<?> String = Class.forName("java.lang.String");
        Method[] methods = String.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
    }
}
}
