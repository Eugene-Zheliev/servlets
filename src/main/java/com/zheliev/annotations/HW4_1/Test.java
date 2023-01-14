package com.zheliev.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
    int a();//почему переменная представленна в виде метода?
    int b();
}
