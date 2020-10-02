package demo05;

public class Demo5_39 {
    public static void main(String[] args) {
       Demo39 d1 =new Demo39();
       d1.temp ="hello";
        System.out.println("fun()方法调用之前："+d1.temp);
        fun(d1);
        System.out.println("fun()方法调用之后："+d1.temp);

    }
    public static void fun(Demo39 d2){
        d2.temp="world";
    }
}
class Demo39{
    String temp = "hello";
}