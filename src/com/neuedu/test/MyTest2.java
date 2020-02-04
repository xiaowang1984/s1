package com.neuedu.test;

/**
 * Created by Neuedu on 2020/2/4.
 */
public class MyTest2 {
    public static void main(String[] args) {
        /**
         *
         *    在堆区中定义了一个连续的内存空间来储存多个变量
         *
         *    定义方式
         *      1 数据类型[] 变量名 = new 数据类型[个数];
         *      2 数据类型[] 变量名 = {内容，内容};
         *
         *      读写
         *      变量[下标] 来获取或者设置值
         *      下标的范围 从 0~~数组的长度-1
         *      数组一旦定义长度 无法更改
         *
         * */
        /*int[] array = new int[5];
        array[0]=1;
        array[1]=4;
        array[2]=6;
        array[3]=8;
        array[4]=10;*/
        int[] array = {1,4,6,8,10,33};
        for(int i = 0;i<=array.length;i++){
            int a = array[i];
            System.out.println(a);
        }
        for(int a : array){
            System.out.println(a);
        }
        /*
        * 1 - 4 之间 拿出任意3个数  最多能组成多少个数字  并打印
        *
        * 1-100之间的偶数和
        *
        * 定义两个int变量 m和n  计算m的n次方
        *
        * 100~999之间的水仙花数  例如 153  1^3+5^3+3^3=153
        *
        * 两个正整数 计算最大公约数和最小公倍数
        *
        *
        *
        * */
    }
}
