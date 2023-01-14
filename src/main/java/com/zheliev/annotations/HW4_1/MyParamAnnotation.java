package com.zheliev.annotations.HW4_1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyParamAnnotation {
    int a();
    int b();
}
