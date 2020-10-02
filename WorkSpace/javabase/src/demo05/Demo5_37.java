package demo05;

public class Demo5_37 {
    public static void main(String[] args) {
        Demo37 d1 = new Demo37();
        d1.temp = 50;
        System.out.println("fun()方法调用之前："+d1.temp);
        fun(d1);
        System.out.println("fun()方法调用之前："+d1.temp);

    }
    public static  void fun(Demo37 d2){
        d2.temp=1000;
    }
}

class Demo37{
    int temp = 30;
}