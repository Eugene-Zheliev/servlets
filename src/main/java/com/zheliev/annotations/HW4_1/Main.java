package com.zheliev.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestingClass testingClass = new TestingClass();
        Class<?> cls = TestingClass.class;

        Method[] methods = cls.getDeclaredMethods();

        for (Method m : methods){
            if (m.isAnnotationPresent(Test.class)){
                Test test = m.getAnnotation(Test.class);
                m.invoke(testingClass, test.a(), test.b());
            }
        }
    }
}
