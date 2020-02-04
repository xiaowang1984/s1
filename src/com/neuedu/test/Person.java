package com.neuedu.test;

/**
 * Created by Neuedu on 2020/2/3.
 */
public class Person {
    public static int abc = 100;
    private int age;
    private int no;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public static int add(int a,int b){
        System.out.println(abc);
        int c = a+b;
        return c;
    }

}
