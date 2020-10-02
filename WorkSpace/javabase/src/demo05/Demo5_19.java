package demo05;

public class Demo5_19 {
    public static void main(String[] args) {
        {
            int x=30;
            System.out.println("普通代码块 --> x="+x);
        }
        int x = 100;
        System.out.println("代码块之外--> x="+x);
    }
}
