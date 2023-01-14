package com.zheliev.annotations.HW4_2;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TextContainer textContainer = new TextContainer();
        Class<?> cls = textContainer.getClass();

        if(!cls.isAnnotationPresent(SaveTo.class)){
            System.out.println("Error!");
            return;//зачем здесь это ключевое слово?!
        }

        SaveTo saveTo = cls.getAnnotation(SaveTo.class);
        String path = saveTo.path();
        //вариант №1
//        textContainer.save(path);

        //вариант №2
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods){
            if (m.isAnnotationPresent(Saver.class)){
                m.invoke(textContainer, path);
                break;
            }
        }
        System.out.println("Done!");
    }
}
