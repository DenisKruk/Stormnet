package com.company;

public class OutF {
    public static void main(String[] args) {
        int a=3;
        double b= 2.6;
        String s= "string";
        String result=String.format("int=%d, double = %f, string=%s", a,b,s);
        System.out.println(result);
    }
}
