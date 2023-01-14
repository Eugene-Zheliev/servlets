package com.zheliev.annotations.HW4_3;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.security.InvalidParameterException;

public class DeSerializer {
    public static <T> T deSerialize (String s, Class<T> cls) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        T res = cls.getDeclaredConstructor().newInstance();
        String[] parts = s.split(", ");

        for (String p : parts){
            String[] np = p.split("=");
            if (np.length != 2){
                throw new InvalidParameterException(s);
            }
            String name = np[0];
            String value = np[1];
            Field f = cls.getDeclaredField(name);
            if (Modifier.isPrivate(f.getModifiers())){
                f.setAccessible(true);
            }
            if (f.isAnnotationPresent(Save.class)){
                if(f.getType() == int.class){
                    f.setInt(res, Integer.parseInt(value));
                } else if (f.getType() == String.class) {
                    f.set(res, value);
                } else if (f.getType() == long.class) {
                    f.set(res, Long.parseLong(value));
                }
            }
        }
        return res;
    }
}
