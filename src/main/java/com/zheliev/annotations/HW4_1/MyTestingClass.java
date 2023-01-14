package com.zheliev.annotations.HW4_1;

public class MyTestingClass {
    @MyParamAnnotation (a =2, b = 5)
    public void summation(int a, int b){
        System.out.println(a + b);
    }
}
