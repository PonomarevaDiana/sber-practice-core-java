package org.example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Messages msgs =new Messages();
        print(msgs);
    }
    private static void print (Messages msgs) throws InvocationTargetException, IllegalAccessException {
            Class clazz = msgs.getClass();
            Method [] methods =clazz.getDeclaredMethods();
            for (Method m: methods) {
                String s = m.getAnnotation(Print.class).style();
                String c = m.getAnnotation(Print.class).color();
                String text = m.invoke(msgs).toString();
                System.out.println(c + s + s + s + text + s + s + s + c);

            }

    }

}