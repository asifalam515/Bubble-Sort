package com.company;

public class Swap {
    public static void main(String[] args) {
       int a=5;
       int b=4;
        int temp;
        temp=a;
       a=b;//new value of a is b which means 4
       b=temp;
        System.out.println("Swapped a and b");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
