package demo05;

public class Demo5_55 {
    public static void main(String[] args) {
        new Demo555();
        new Demo555();
        new Demo555();
    }
}
class Demo555{
    private static int count =0;
    public Demo555(){
        count++;
        System.out.println("产生了"+count+"个对象");
    }
}