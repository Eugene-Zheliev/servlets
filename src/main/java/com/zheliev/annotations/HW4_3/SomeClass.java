package com.zheliev.annotations.HW4_3;

public class SomeClass {
    @Save
    public int a;

    @Save
    private String b;

    public long c;

    public int getA(){
        return a;
    }

    public void setA(int a){
        this.a = a;
    }

    public String getB(){
        return b;
    }

    public void setB(String b){
        this.b = b;
    }

    public long getC(){
        return c;
    }

    public void setC(long c){
        this.c = c;
    }
}
