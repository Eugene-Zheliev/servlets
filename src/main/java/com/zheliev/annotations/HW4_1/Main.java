package com.zheliev.annotations.HW4_1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        MyTestingClass myTestingClass = new MyTestingClass();
        Class<?> cls = MyTestingClass.class;

        Method[] methods = cls.getDeclaredMethods();

        for (Method m : methods){
            if (m.isAnnotationPresent(MyParamAnnotation.class)){
                MyParamAnnotation test = m.getAnnotation(MyParamAnnotation.class);
                m.invoke(myTestingClass, test.a(), test.b());
            }
        }
    }
}
