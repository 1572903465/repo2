package demo05;

public class Demo5_60 {
    public static void main(String[] args) {
        new Demo560();
        new Demo560();
        new Demo560();
    }
}
class Demo560{
    {
        System.out.println("1、构造块。");
    }

    public Demo560() {
        System.out.println("2、构造方法。");
    }
}