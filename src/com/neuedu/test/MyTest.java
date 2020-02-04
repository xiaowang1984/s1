package com.neuedu.test;

/**
 * Created by Neuedu on 2020/2/3.
 */
public class MyTest {
    public static void main(String[] args) {
       /* Person person = new Person();
        person.setAge(10);
        int age = person.getAge();
        System.out.println(age);*/
       int year = 1992;
       /**
        *  四年一闰 百年不润  四百年再闰
        *
        *  可以整除4的同时 不能整除100  或者  直接可以整除400
        *
        *
        * */
      /* if((year%4==0&&year%100!=0)||year%400==0){
           System.out.println("是闰年");
       }else{
           System.out.println("不是闰年");
       }*/
      /**
       *   循环
       *    while 循环
       *    do while 循环
       *    for  循环
       *
       *    循环的条件
       *        1 计数器
       *        2 循环条件
       *        3 更新技术器
       *
       *  练习 计算 1-100 累加
       *
       *  ++和-- 操作
       *
       *  i++ 先取i值 然后 i再进行 ++操作
       *  ++i 先进行++操作 再进行取值
       *
       *
       * */
     /* int sum = 0;
        for(int i=1;i<=100;i++){
           sum += i;
        }
        System.out.println(sum);*/
       /**
        *   计算 1-100的质数和
        *
        *  判断是否是质数
        *  写一个方法  判断是否是质数  如果是质数 则返回原数 如果不是质数 返回0
        *
        *
        * */
       /**
        *    方法重载
        *   在同一个类中 方法名定义相同  但是参数列表定义不同 为方法重载
        *
        *   参数列表的不同体现在3个方面
        *       1 参数的个数不同
        *       2 参数的类型不同
        *       3 参数列表的顺序不同
        *    方法重载 与 方法的返回值无关
        * */
       /**
        *   静态方法
        *       类级别的方法
        *       适用于一些工具 也就是说不依赖类中属性的方法
        *       可以不用创建对象 直接调用该方法
        *       定义的方式
        *       访问修饰符  static 返回值类型  方法名(参数列表) { 代码块}
        *  静态属性
        *       类级别的属性 整个类中只有一个值
        *
        *   静态方法中 不能调用 其他非静态方法 也不能使用非静态属性
        *
        * */
       /*int a = 10;
       method(a);
        System.out.println(a);
        a的值为10 没有变化
        */
       /*Person a = new Person();
       a.setAge(10);
       method(a);
        System.out.println(a.getAge());
        a的age值是100 有变化
        */
       /**
        *  堆区  以new关键词创建的对象 jdk1.7之后 常量池在堆区中存储
        *  栈区  （后进先出）存放栈帧 每次调用一个方法的时候产生一个栈帧入栈 栈帧中保存临时变量和参数
        *  方法区  保存类的信息（类 类中的属性  类中的方法） 所有用static修饰的成员 jdk1.7之前 常量池在方法区中
        *
        *
        * */
        /**
         *
         *   a++ 先取值后自加
         *   ++a 先自加后取值
         * */
       int a =1 ;
       int b =2 ;
        System.out.println(a);

    }
    public static int method(int a,int b){
        int c = a+b;
       return  c;
    }
    public static void method(Person a){
        a.setAge(100);
    }
}
