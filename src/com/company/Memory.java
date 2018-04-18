package com.company;

public class Memory {
    public static void main(String[] args) {//1
        int i = 1;//2
        Object object =new Object();//3
        Memory memory= new Memory();//4
        memory.exMethod(object);//5
    }//8
    private void exMethod(Object param){//6
        String string=param.toString();
        System.out.println(string);
    }//7
}
