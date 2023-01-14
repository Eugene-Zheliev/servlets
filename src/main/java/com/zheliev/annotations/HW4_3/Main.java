package com.zheliev.annotations.HW4_3;

public class Main {
    public static void main(String[] args) throws Exception{
        SomeClass sc = new SomeClass();
        sc.setA(7);
        sc.setB("Hello");
        sc.setC(1234568989);

        String res = Serializer.serialize(sc);
        System.out.println("Serialized: " + res);

        sc = DeSerializer.deSerialize(res, SomeClass.class);
        System.out.println("DeSerialized: " + sc.getA() + ", " + sc.getB() + ", " + sc.getC());
    }
}
