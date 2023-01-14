package com.zheliev.annotations;

public class TestingClass {
    @Test (a =2, b = 5)
    public static void test(int a, int b){
        System.out.println(a + b);
    }
}
