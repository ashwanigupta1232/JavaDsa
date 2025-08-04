package com.ak.java;

public class Singleton
{
// eager loading
    private  static  Singleton singlton;


    private Singleton(){}

    public static Singleton getGetInstance() {
       if (singlton==null){
           singlton =  new Singleton();
       }
       return singlton;
    }

    public static void main(String[] args) {
        Singleton s1 =  Singleton.getGetInstance();
        Singleton s2 =  Singleton.getGetInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
